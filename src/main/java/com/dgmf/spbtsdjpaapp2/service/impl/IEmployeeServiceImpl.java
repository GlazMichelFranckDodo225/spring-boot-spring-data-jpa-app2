package com.dgmf.spbtsdjpaapp2.service.impl;

import com.dgmf.spbtsdjpaapp2.entity.Employee;
import com.dgmf.spbtsdjpaapp2.repository.EmployeeRepository;
import com.dgmf.spbtsdjpaapp2.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IEmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }
}
