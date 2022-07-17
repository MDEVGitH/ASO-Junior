package com.prueba.demo.repository;

import com.prueba.demo.entities.Employee;
import com.prueba.demo.entities.RangoProfesional;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImp implements EmployeeRepository{
    @Override
    public Employee findAll() {
        Employee employee = new Employee();
        employee.setNombre("Jonh Doe");
        employee.setProfesion("Programador");
        employee.setEdad(25);

        List<String> lenguajes = new ArrayList<>();
        lenguajes.add("PHP");
        lenguajes.add("Javascript");
        lenguajes.add("Dart");
        employee.setLenguajes(lenguajes);

        employee.setDisponibilidadParaViajar(true);

        RangoProfesional rangoProfesional = new RangoProfesional();
        rangoProfesional.setAniosDeExperiencia(12);
        rangoProfesional.setNivel("Junior");
        employee.setRangoProfesional(rangoProfesional);
        return employee;
    }
}
