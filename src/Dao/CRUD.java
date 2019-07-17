package Dao;

import java.util.List;

/** @author MIKHUNA S.A.C */

public interface CRUD<T> {
    public void registrar(T t) throws Exception;
    public void modificar(T t) throws Exception;
    public void eliminar(T t) throws Exception;
    public List<T> listar() throws Exception;
    
    //extra
    public List<T> buscarpor(String t) throws Exception;
    public T buscarporid(int t) throws Exception;
    public T buscarporcod(String t) throws Exception;
}
