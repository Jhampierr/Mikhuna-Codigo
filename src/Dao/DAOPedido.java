package Dao;

import Model.DetallePedido;
import Model.EstadoPedido;
import Model.Mesa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/** @author MIKHUNA S.A.C */

public class DAOPedido extends Conexion implements CRUD<DetallePedido>{

    @Override
    public void registrar(DetallePedido t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("INSERT INTO `pedido` (`cod_pedido`, `fecha_hora`, `estado`) VALUES (?, NOW(), ?);");
            st.setString(1, t.getCodigoP());
            st.setString(2, t.getEstadoPed().name());
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
            PreparedStatement st =  this.conexion.prepareStatement("UPDATE  `pedido` SET , `estado` = ?," +
                                                "`cod_empleado` = ?," +
                                                "`cod_cliente` = ?, `cod_mesa` = ?, `direccion` = ? WHERE `cod_pedido` = ?;");
            
            st.setString(1, t.getEstadoPed().name());
            st.setString(2, t.getDempleado().getCodigoE());
            st.setString(3, t.getDcliente().getCodigoC());
            st.setString(4, t.getDmesa().getCodigoM());
            st.setString(5, t.getDireccionP());
            st.setString(6, t.getCodigoP());
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
            PreparedStatement st =  this.conexion.prepareStatement("DELETE FROM `pedido` WHERE `cod_pedido` = ?;");
            st.setString(1, t.getCodigoP());
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
            PreparedStatement st =  this.conexion.prepareStatement("SELECT `pedido`.`cod_pedido`, `pedido`.`cod_mesa`,`pedido`.`direccion`, `factura`.`subtotal`, `pedido`.`estado`, `pedido`.`fecha_hora`, `pedido`.`fecha_hora_c` FROM `pedido`, `factura` WHERE `pedido`.`cod_pedido` = `factura`.`cod_pedido` ORDER by `pedido`.`fecha_hora`");
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                DetallePedido pedido = new DetallePedido();
                Mesa mesa = new Mesa();
                pedido.setCodigoP(rs.getString("cod_pedido"));
                mesa.setCodigoM(rs.getString("cod_mesa"));
                pedido.setDmesa(mesa);
                pedido.setDireccionP(rs.getString("direccion")); 
                pedido.setMontoP(rs.getDouble("subtotal"));
                pedido.setEstadoPed(EstadoPedido.valueOf(rs.getString("estado")));
                pedido.setFechahoraP(rs.getDate("fecha_hora").toLocalDate());
                pedido.setFechahoraP(rs.getDate("fecha_hora_c").toLocalDate());
                lista.add(pedido);
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
