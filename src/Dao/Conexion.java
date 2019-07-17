package Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** @author MIKHUNA S.A.C */

public class Conexion {
    protected Connection conexion; //ambito solo del paquete
    
    private final String DB_URL = "jdbc:mysql://localhost:3307/mikhuna?useSSL=false";
    
    private final String USUAR = "root";
    private final String CONTR = "usbw";
    
    public void conectar() throws Exception{
        try{
            conexion = DriverManager.getConnection(DB_URL,USUAR,CONTR);
            Class.forName("com.mysql.jdbc.Driver");
        }catch(SQLException e){
            throw e;
        }
    }
    
    public void cerrar() throws Exception{
        if(conexion != null){
            if(!conexion.isClosed()){
                conexion.close();
            }
        }
    }

}
