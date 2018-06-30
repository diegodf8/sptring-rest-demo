package com.cice.apirest.web.rest;

import com.cice.apirest.service.IGestionUsuarios;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

import java.util.List;

@Api(value = "testRest", description ="API de pruebas")
@RestController("/usuario")
public class UserResource {

    @Autowired
    @Qualifier("Gestion")
    IGestionUsuarios gestionUsuarios;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value ="Recupera todos los usuarios de la aplicación",httpMethod = "GET",produces = "List<String>")
    public ResponseEntity<List<String>> getUsuarios(){
        gestionUsuarios.listaNombres();
        return new ResponseEntity<>(gestionUsuarios.listaNombres(), HttpStatus.ACCEPTED);
    }

    @RequestMapping(method = RequestMethod.POST)
    public String crearUsuario(@PathParam (value = "nombre") String nombre,
                               @PathParam (value = "apellidos") String apellidos){
        gestionUsuarios.crearUsuario(nombre,apellidos);
        return "Usuario creado " + nombre;
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String borrrarUsuario(@PathParam (value = "id") String id){
        gestionUsuarios.eliminarUsuario(id);
        return "Usuario borrado " + id;
    }

    @RequestMapping(method = RequestMethod.PUT)
    public String actualizarUsuario(@PathParam (value = "id") Long id){
        gestionUsuarios.actualizarUsuario(id);
        return "Usuario actualizado " + id;
    }

     /*
     @RequestMapping(value = "/usuario/{nombre}/{apellidos}",method = RequestMethod.POST)
    public String crearUsuario(@PathVariable("nombre") String nombre){
        gestionUsuarios.crearUsuario(nombre,"test");
        return "Usuario creado " + nombre;
    }
    */





}
