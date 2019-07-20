package Dao;

import Model.Factura;
import Model.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**@author Jairo */

public class DAOFactura extends Conexion implements CRUD<Factura> {

    @Override
    public void registrar(Factura t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("INSERT INTO `factura` (`cod_factura`, `subtotal`, `igv`, `pago_final`, `cod_pedido`) VALUES (?, '0', '0', '0', ?);");
            st.setString(1, t.getCodigoF());
            st.setString(2, t.getdPedido().getCodigoP());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void modificar(Factura t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Factura t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("DELETE * FROM `factura` WHERE `cod_pedido`= ?;");
            st.setString(1, t.getdPedido().getCodigoP());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public List<Factura> listar() throws Exception {
        List<Factura> lista = null;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT * FROM `factura`");
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Factura factura = new Factura();
                Pedido codp = new Pedido();
                
                factura.setCodigoF(rs.getString("cod_factura"));
                factura.setSubtotalF(rs.getDouble("subtotal"));
                factura.setIgv(rs.getDouble("igv"));
                factura.setPagoFinalF(rs.getDouble("pago_final"));
                
                codp.setCodigoP(rs.getString("cod_pedido"));
                factura.setdPedido(codp);
                
                lista.add(factura);
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
    public List<Factura> buscarpor(String t) throws Exception {
        List<Factura> lista = null;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT * FROM `factura` WHERE `cod_pedido` = ?");
            st.setString(1, t);
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Factura factura = new Factura();
                Pedido codp = new Pedido();
                
                factura.setCodigoF(rs.getString("cod_factura"));
                factura.setSubtotalF(rs.getDouble("subtotal"));
                factura.setIgv(rs.getDouble("igv"));
                factura.setPagoFinalF(rs.getDouble("pago_final"));
                
                codp.setCodigoP(rs.getString("cod_pedido"));
                factura.setdPedido(codp);
                
                lista.add(factura);
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
    public Factura buscarporid(int t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Factura buscarporcod(String t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
