package com.empservice.controller;

import com.empservice.model.Employee;
import com.empservice.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpserviceController {

    @Autowired
    private EmpService empService;

    @GetMapping("/employees")
    public List<Employee> getEmployeeList(){
        return empService.getEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public  Employee getEmployeeById(@PathVariable Long employeeId){
        List<Employee> employees=empService.getEmployees();
        for(Employee employee: employees){
           if(employee.getEmpId() == employeeId){
               return employee;
           }
        }
        return new Employee();
    }
}
