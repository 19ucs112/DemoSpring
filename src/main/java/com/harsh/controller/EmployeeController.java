package com.harsh.controller;

import com.harsh.employee.Employee;
import com.harsh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e){
        Employee e1 = employeeService.saveEmployee(e);
        return ResponseEntity.ok(e1);
    }
}
