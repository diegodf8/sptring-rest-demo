package com.cice.apirest.service;

import java.util.List;

public interface IGestionUsuarios {

    /**
     * *Metodo que recupera una lista de nombres de usuarios
     * @return
     */
    List<String> listaNombres();

    /**
     * Metodo que crea un usuario
     * @param nombre
     * @return
     */

    boolean crearUsuario(String nombre);


    /**
     * Metodo para actualizar  un usuario en base de datos
     * @param nombre
     * @return
     */

    boolean actualizarUsuario(String nombre);

    /**
     * Metodo para eliminar un usuario de base de datos
      * @param nombre
     * @return
     */

    String eliminarUsuario(String nombre);
}
