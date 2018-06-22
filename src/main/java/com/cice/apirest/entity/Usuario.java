package com.cice.apirest.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
@Data
public class Usuario {
    private String id;
    private String nombre;
    private String apellidos;
    private String email;
}
