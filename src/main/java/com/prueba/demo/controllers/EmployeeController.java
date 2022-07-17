package com.prueba.demo.controllers;

import com.prueba.demo.entities.Employee;
import com.prueba.demo.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService service;

    @GetMapping("/api/employee")
    public Employee getAll(){
        return service.getAll();
    }

}
