package com.cice.apirest.service;

import com.cice.apirest.entity.Usuario;
import com.cice.apirest.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service("Gestion")
public class GestionUsuarios implements IGestionUsuarios {

    @Autowired
    UsuarioRepository usuarioRepository

    @Override
    public List<String> listaNombres() {
        return usuarioRepository.findAll().stream().map(usuario -> usuario.getNombre()).collect(Collectors.toList());
        //return Arrays.asList(new String [] {"Diego" , "Pepe", "Alberto" });
    }

    @Override
    public boolean crearUsuario(String nombre) {
        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuarioRepository.save(usuario);
        return false;
    }

    @Override
    public boolean actualizarUsuario(String nombre) {
        return false;
    }

    @Override
    public String eliminarUsuario(String nombre) {
        return null;
    }
}
