package com.empservice.service;

import com.empservice.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmpService {

    public List<Employee> employees;
    public List<Employee> getEmployees(){
        employees = new ArrayList<>();
        employees.add(new Employee(1, "raja", "developer", "cbe", 25000));
        employees.add(new Employee(2, "ajmal", "tester", "ooty", 15000));
        employees.add(new Employee(3, "rahul", "hr", "bangalore", 20000));
    return employees;
    }
}
