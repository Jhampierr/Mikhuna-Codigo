package Dao;

import Model.Alimento;
import Model.DetallePedido;
import Model.Pedido;
import Model.TipoAlimento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/** @author MIKHUNA S.A.C */

public class DAODetallePedido extends Conexion implements CRUD<DetallePedido>{

    @Override
    public void registrar(DetallePedido t) throws Exception {
         try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("INSERT INTO `detalle_pedido` (`id_detalle_pedido`,`cod_pedido`) VALUES (null, ?);");
            st.setString(1, t.getDpedido().getCodigoP());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void modificar(DetallePedido t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("UPDATE `detalle_pedido` SET `cantidad` = ?, `total` = ?, `cod_alimento` = ? WHERE `detalle_pedido`.`id_detalle_pedido` = ?;");
            st.setInt(1, t.getCantAlimento());
            st.setDouble(2, t.getTotal());
            st.setString(3, t.getDalimentos().getCodigoA());
            st.setInt(4, t.getCodigoDetPedido());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(DetallePedido t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("DELETE * FROM `detalle_pedido` WHERE `detalle_pedido`.`id_detalle_pedido` = ?;");
            st.setInt(1, t.getCodigoDetPedido());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public List<DetallePedido> listar() throws Exception {
        List<DetallePedido> lista = null;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT * FROM `detalle_pedido`");
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                DetallePedido dpedido = new DetallePedido();
                Pedido codp = new Pedido();
                Alimento alimento = new Alimento("", "", 10.5, LocalDate.parse("2019-07-15"), TipoAlimento.ENTRADA);
                
                dpedido.setCodigoDetPedido(rs.getInt("id_detalle_pedido"));
                dpedido.setCantAlimento(rs.getInt("cantidad"));
                dpedido.setTotal(rs.getDouble("total"));
                
                codp.setCodigoP(rs.getString("cod_pedido"));
                dpedido.setDpedido(codp);
                
                alimento.setCodigoA(rs.getString("cod_alimento"));
                dpedido.setDalimentos(alimento);
                
                lista.add(dpedido);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return lista;
    }

    @Override
    public List<DetallePedido> buscarpor(String t) throws Exception {
        List<DetallePedido> lista = null;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT * FROM `detalle_pedido` WHERE `cod_pedido` = ?");
            st.setString(1, t);
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                DetallePedido dpedido = new DetallePedido();
                Pedido codp = new Pedido();
                Alimento alimento = new Alimento("", "", 10.5, LocalDate.parse("2019-07-15"), TipoAlimento.ENTRADA);
                
                dpedido.setCodigoDetPedido(rs.getInt("id_detalle_pedido"));
                dpedido.setCantAlimento(rs.getInt("cantidad"));
                dpedido.setTotal(rs.getDouble("total"));
                
                codp.setCodigoP(rs.getString("cod_pedido"));
                dpedido.setDpedido(codp);
                
                alimento.setCodigoA(rs.getString("cod_alimento"));
                dpedido.setDalimentos(alimento);
                
                lista.add(dpedido);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return lista;
    }

    @Override
    public DetallePedido buscarporid(int t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DetallePedido buscarporcod(String t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
