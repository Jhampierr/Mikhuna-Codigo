package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/** @author MIKHUNA S.A.C */

public class DAOValidar extends Conexion implements validar{

    @Override
    public String ValidarUsuario(String cod, String cl) throws Exception {
        String credenciales;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT cod_empleado, tipo_empleado, clave FROM `empleado` WHERE `cod_empleado` = ? AND `clave`= ? AND (tipo_empleado='ADMINISTRADOR' OR tipo_empleado='CAJERO' OR tipo_empleado='COCINERO')");
            st.setString(1, cod);
            st.setString(2, cl);
            ResultSet rs = st.executeQuery();
            
            if(rs.next()){ 
                    credenciales = rs.getString("tipo_empleado");
            } else {
                credenciales = "";
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return credenciales;
    }
    
    //public boolean 
}
