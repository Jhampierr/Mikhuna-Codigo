package Dao;

import Model.Alimento;
import Model.TipoAlimento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/** @author MIKHUNA S.A.C */

public class DAOAlimento extends Conexion implements CRUD<Alimento>{

    @Override
    public void registrar(Alimento t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("INSERT INTO `alimento` "+
                    "(`cod_alimento`, `nombre`, `precio`, `ultima_edicion`, `tipo_alimento`) "+
                    "VALUES (?, ?, ?, now(), ?);");
            st.setString(1, t.getCodigoA());
            st.setString(2, t.getNombreA());
            st.setDouble(3, t.getPrecio());
            st.setString(4, t.getTipoAli().name());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void modificar(Alimento t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("UPDATE  `alimento` SET  "+
                                                "`nombre` =  ?, "+
                                                "`precio` = ?," +
                                                "`ultima_edicion` = now()," +
                                                "`tipo_alimento` = ? WHERE `cod_alimento` = ?");
            st.setString(1, t.getNombreA());
            st.setDouble(2, t.getPrecio());
            st.setString(3, t.getTipoAli().name());
            st.setString(4, t.getCodigoA());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Alimento t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("DELETE FROM `alimento` WHERE `cod_alimento` = ?;");
            st.setString(1, t.getCodigoA());
            st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
    }
    
    private Alimento convertir(ResultSet rs) throws Exception{
        String codigo = (rs.getString("cod_alimento"));
        String nombre = (rs.getString("nombre"));
        double precio = (rs.getDouble("precio"));
        LocalDate fecha = (rs.getDate("ultima_edicion").toLocalDate());
        TipoAlimento tipo_A = (TipoAlimento.valueOf(rs.getString("tipo_alimento")));
        Alimento al = new Alimento(codigo, nombre, precio, fecha, tipo_A);
        return al;
    }
    
    @Override
    public List<Alimento> listar() throws Exception {
        List<Alimento> lista = null;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT * FROM `alimento`;");
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                lista.add(convertir(rs));
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
    public List<Alimento> buscarpor(String txt) throws Exception {
        List<Alimento> lista = null;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT * FROM `alimento` WHERE `nombre` like ?");
            st.setString(1, "%"+txt+"%");
            lista = new ArrayList<>();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                lista.add(convertir(rs));
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
    public Alimento buscarporid(int t) {
        throw new UnsupportedOperationException("No soportado utlizar buscarporcod(String t)"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alimento buscarporcod(String t) throws Exception {
        Alimento alim = null;
        try{
            this.conectar();
            PreparedStatement st =  this.conexion.prepareStatement("SELECT * FROM `alimento` WHERE `cod_alimento` = ?");
            st.setString(1, t);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                alim = convertir(rs);
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
        return alim;
    }
    
}
