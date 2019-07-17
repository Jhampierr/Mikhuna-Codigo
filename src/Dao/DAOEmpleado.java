package Dao;

import Model.Empleado;
import Model.TipoEmpleado;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/** @author MIKHUNA S.A.C */

public class DAOEmpleado extends Conexion implements CRUD<Empleado>{
    @Override
    public void registrar(Empleado empl) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("INSERT INTO `empleado` (`cod_empleado`, `nombres`, `documento`, `telefono`, `direccion`, `clave`, `fecha_vinculacion`, `tipo_empleado`)"+
                    " VALUES (?, ?, ?, ?, ?, ?, now(), ?);");
            st.setString(1, empl.getCodigoE());
            st.setString(2, empl.getNombreP());
            st.setString(3, empl.getDocumento());
            st.setString(4, empl.getTelefono());
            st.setString(5, empl.getDireccion());
            st.setString(6, empl.getClave());
            st.setString(7, empl.getTipoEmp().name()); 
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }
    
    @Override
    public void modificar(Empleado empl) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("UPDATE  `empleado` SET  `nombres` =  ?, `documento` = ?," +
                                                "`telefono` = ?," +
                                                "`direccion` = ?," +
                                                "`clave` = ?," +
                                                "`tipo_empleado` = ? WHERE  `cod_empleado` = ?;");
            st.setString(1, empl.getNombreP());
            st.setString(2, empl.getDocumento());
            st.setString(3, empl.getTelefono());
            st.setString(4, empl.getDireccion());
            st.setString(5, empl.getClave());
            st.setString(6, empl.getTipoEmp().name()); 
            st.setString(7, empl.getCodigoE());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }        
    }
    @Override
    public void eliminar(Empleado empl) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("DELETE FROM `empleado` WHERE `empleado`.`cod_empleado` = ?;");
            st.setString(1, empl.getCodigoE());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }       
    }
    @Override
    public List<Empleado> listar() throws Exception {
        List<Empleado> lista = null;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT * FROM empleado");
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Empleado emple = new Empleado();
                emple.setCodigoE(rs.getString("cod_empleado"));
                emple.setNombreP(rs.getString("nombres"));
                emple.setDocumento(rs.getString("documento"));
                emple.setTelefono(rs.getString("telefono"));
                emple.setDireccion(rs.getString("direccion"));
                emple.setClave(rs.getString("clave"));                
                emple.setFechaValidacion(rs.getDate("fecha_vinculacion").toLocalDate());
                emple.setTipoEmp(TipoEmpleado.valueOf(rs.getString("tipo_empleado")));
                lista.add(emple);
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
    public Empleado buscarporid(int t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> buscarpor(String t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado buscarporcod(String t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

