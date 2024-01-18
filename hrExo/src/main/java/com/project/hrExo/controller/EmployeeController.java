package com.project.hrExo.controller;

import com.project.hrExo.model.Employee;
import com.project.hrExo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/{id}")
    private Optional<Employee> getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id);
    }

    @GetMapping
    private Iterable<Employee> findAllEmployees() {
        return employeeService.getEmployees();
    }
}
