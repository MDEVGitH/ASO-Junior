package com.prueba.demo.services;

import com.prueba.demo.entities.Employee;
import com.prueba.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    @Autowired
    private EmployeeRepository repository;

    @Override
    public Employee getAll() {
        return repository.findAll();
    }

}
