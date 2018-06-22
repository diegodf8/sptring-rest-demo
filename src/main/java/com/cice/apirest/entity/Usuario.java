package com.cice.apirest.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
@Data
public class Usuario {
    @Id
    @GeneratedValue
    @Column(name ="id")
    private Long id;

    @Column(name ="nombre")
    private String nombre;

    @Column(name ="apellidos")
    private String apellidos;

    @Column(name ="email")
    private String email;
}
