package com.prueba.demo.repository;

import com.prueba.demo.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository{
    Employee findAll();
}
