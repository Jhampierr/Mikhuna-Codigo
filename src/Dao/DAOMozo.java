package Dao;

import Model.Empleado;
import Model.TipoEmpleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**@author Jairo */

public class DAOMozo extends Conexion implements CRUD<Empleado>{

    @Override
    public void registrar(Empleado t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Empleado t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Empleado t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> listar() throws Exception {
        List<Empleado> lista = null;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT cod_empleado, nombres, tipo_empleado FROM empleado WHERE tipo_empleado = 'MOZO'");
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Empleado emple = new Empleado();
                emple.setCodigoE(rs.getString("cod_empleado"));
                emple.setNombreP(rs.getString("nombres"));
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
    public List<Empleado> buscarpor(String t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado buscarporid(int t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado buscarporcod(String t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
