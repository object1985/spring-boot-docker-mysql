package com.tonaise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tonaise.demo.repository.EmployeeRepository;

import jp.co.tonaise.demo.entity.Employee;

@RestController("/")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/all")
    public List<Employee> getAllEmloyees() {
	return employeeRepository.findAll();
    }

    @PostMapping("/save")
    public Employee saveEmloyees(@RequestBody Employee employee) {
	return employeeRepository.save(employee);
    }
}
