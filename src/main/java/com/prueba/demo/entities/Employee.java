package com.prueba.demo.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Employee {
    private String nombre;
    private String profesion;
    private Integer edad;
    private List<String> lenguajes;
    private Boolean disponibilidadParaViajar;
    private RangoProfesional rangoProfesional;


}
