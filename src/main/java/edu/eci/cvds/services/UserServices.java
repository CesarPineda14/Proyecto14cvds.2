package edu.eci.cvds.services;

import edu.eci.cvds.entities.Usuario;

public interface UserServices {

    public abstract Usuario consultarUsuario(String username, String password);

}
