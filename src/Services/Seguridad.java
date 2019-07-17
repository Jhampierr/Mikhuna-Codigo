package Services;

import Dao.DAOValidar;

public class Seguridad {

    public String Validacion(String Usuario, String Contrasenia) throws Exception {
        String usuarioValidado, Validacion;
        DAOValidar vali = new DAOValidar();

        if (Usuario.equals("") || Contrasenia.equals("")) {
            usuarioValidado = "complete los datos";
        } else {
            Validacion = vali.ValidarUsuario(Usuario,Contrasenia);
            if (Validacion.equals("")) {
                usuarioValidado = "Usuario o Password erroneo";
            } else {
                if (Validacion.equals("CAJERO")) {
                    usuarioValidado = "CAJERO";
                } else {
                    if (Validacion.equals("ADMINISTRADOR")) {
                        usuarioValidado = "ADMINISTRADOR";
                    } else {
                        usuarioValidado = "COCINERO";
                    }
                }
            }
        }

        return usuarioValidado;
    }
}
