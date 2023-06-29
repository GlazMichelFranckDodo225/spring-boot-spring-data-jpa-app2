package com.dgmf.spbtsdjpaapp2.service;

import com.dgmf.spbtsdjpaapp2.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();
}
