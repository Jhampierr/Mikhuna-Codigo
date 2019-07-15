package Dao;

import java.util.List;

/** @author MIKHUNA S.A.C */

public interface CRUD<T> {
    public void registrar(T t) throws Exception;
    public void modificar(T t) throws Exception;
    public void eliminar(T t) throws Exception;
    public List<T> listar() throws Exception;
    
    //extra
    public List<T> buscarpor(String txt);
    public T buscarporid(int t);
}
