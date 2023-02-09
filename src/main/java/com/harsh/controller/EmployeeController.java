package com.harsh.controller;

import com.harsh.employee.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {


    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e) {
        return ResponseEntity.ok(e);
    }
}
