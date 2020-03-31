package com.empservice.model;

public class Employee {

    private int empId;
    private String empName;
    private String empDeptName;
    private String city;
    private int salary;

    public Employee(int empId, String empName, String empDeptName, String city, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.empDeptName = empDeptName;
        this.city = city;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDeptName() {
        return empDeptName;
    }

    public void setEmpDeptName(String empDeptName) {
        this.empDeptName = empDeptName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
