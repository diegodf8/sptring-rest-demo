package com.cice.apirest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
