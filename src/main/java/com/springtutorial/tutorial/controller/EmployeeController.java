package com.springtutorial.tutorial.controller;

import com.springtutorial.tutorial.dto.Employee;
import com.springtutorial.tutorial.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(path = "employees/{employeeId}")
    public Employee getEmployeeById (@PathVariable Long employeeId) {
        return employeeService.getEmployeeById(employeeId);
    }


}
