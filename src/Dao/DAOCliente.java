package Dao;

import Model.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/** @author MIKHUNA S.A.C */

public class DAOCliente extends Conexion implements CRUD<Cliente>{

    @Override
    public void registrar(Cliente t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("INSERT INTO `cliente` (`cod_cliente`, `nombres`, `documento`, `telefono`, `direccion`) VALUES (?, ?, ?, ?, ?);");
            st.setString(1, t.getCodigoC());
            st.setString(2, t.getNombreP());
            st.setString(3, t.getDocumento());
            st.setString(4, t.getTelefono());
            st.setString(5, t.getDireccion());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void modificar(Cliente t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("UPDATE  `cliente` SET  `nombres` =  ?, `documento` = ?," +
                                                "`telefono` = ?," +
                                                "`direccion` = ? WHERE `cod_cliente` = ?;");
            st.setString(1, t.getNombreP());
            st.setString(2, t.getDocumento());
            st.setString(3, t.getTelefono());
            st.setString(4, t.getDireccion());
            st.setString(5, t.getCodigoC());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Cliente t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("DELETE FROM `cliente` WHERE `cliente`.`cod_cliente` = ?;");
            st.setString(1, t.getCodigoC());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        } 
    }

    @Override
    public List<Cliente> listar() throws Exception {
        List<Cliente> lista = null;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT * FROM cliente");
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Cliente cli = new Cliente();
                cli.setCodigoC(rs.getString("cod_cliente"));
                cli.setNombreP(rs.getString("nombres"));
                cli.setDocumento(rs.getString("documento"));
                cli.setTelefono(rs.getString("telefono"));
                cli.setDireccion(rs.getString("direccion"));
                lista.add(cli);
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
    public List<Cliente> buscarpor(String t) throws Exception {
        throw new UnsupportedOperationException("NO SOPORTADO"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente buscarporid(int t) throws Exception {
        throw new UnsupportedOperationException("NO SOPORTADO"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente buscarporcod(String t) throws Exception {
        Cliente cli = null;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT * FROM `cliente` WHERE `documento` = ?");
            st.setString(1, t);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Cliente cl = new Cliente();
                cl.setCodigoC(rs.getString("cod_cliente"));
                cl.setNombreP(rs.getString("nombres"));
                cl.setDocumento(rs.getString("documento"));
                cl.setTelefono(rs.getString("telefono"));
                cl.setDireccion(rs.getString("direccion"));
                cli = cl;
            } else {
                throw new Exception("No se encontro registro.");
            } 

            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return cli;
    }
    
}
