package Dao;

import Model.Empleado;
import Model.Mesa;
import Model.TipoEmpleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/** @author MIKHUNA S.A.C */

public class DAOMesa extends Conexion implements CRUD<Mesa>{

    @Override
    public void registrar(Mesa t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("INSERT INTO `mesa` (`cod_mesa`, `descripcion`, `capacidad`, `ubicacion`)"+
                    " VALUES (?, ?, ?, ?);");
            st.setString(1, t.getCodigoM());
            st.setString(2, t.getNombreM());
            st.setInt(3, t.getCapacidad());
            st.setString(4, t.getUbicacionM());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void modificar(Mesa t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("UPDATE  `mesa` SET  `descripcion` =  ?, `capacidad` = ?," +
                                                "`ubicacion` = ? WHERE  `cod_mesa` = ?;");
            st.setString(1, t.getNombreM());
            st.setInt(2, t.getCapacidad());
            st.setString(3, t.getUbicacionM());
            st.setString(4, t.getCodigoM());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Mesa t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("DELETE FROM `mesa` WHERE `cod_mesa` = ?;");
            st.setString(1, t.getCodigoM());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public List<Mesa> listar() throws Exception {
        List<Mesa> lista = null;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT * FROM empleado");
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Mesa mesa = new Mesa();
                mesa.setCodigoM(rs.getString("cod_mesa"));
                mesa.setNombreM(rs.getString("descripcion"));
                mesa.setCapacidad(rs.getInt("capacidad"));
                mesa.setUbicacionM(rs.getString("ubicacion"));
                lista.add(mesa);
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
    public List<Mesa> buscarpor(String t) throws Exception {
        throw new UnsupportedOperationException("NO USAR ESTE METODO!, Comunicate co Jairo"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mesa buscarporid(int t) throws Exception {
        throw new UnsupportedOperationException("NO USAR ESTE METODO!, Comunicate co Jairo"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mesa buscarporcod(String t) throws Exception {
        throw new UnsupportedOperationException("NO USAR ESTE METODO!, Comunicate co Jairo"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
