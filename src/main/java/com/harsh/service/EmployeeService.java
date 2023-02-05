package com.harsh.service;

import com.harsh.employee.Employee;
import com.harsh.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    public Employee saveEmployee(Employee e){
        employeeRepo.save(e);
        return e;
    }
}
