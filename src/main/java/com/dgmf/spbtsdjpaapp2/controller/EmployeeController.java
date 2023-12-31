package com.dgmf.spbtsdjpaapp2.controller;

import com.dgmf.spbtsdjpaapp2.entity.Employee;
import com.dgmf.spbtsdjpaapp2.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @PostMapping
    private Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    private List<Employee> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();

        System.out.println(employees);

        return employees;
    }

    @GetMapping("/{lncontains}")
    public List<Employee> findEmployeeByLastNameContaining(
            @PathVariable("lncontains") String string,
            @RequestParam("str") String str) {
        List<Employee> RetrievedEmployees = employeeService.findEmployeeByLastNameContaining(str);
        // System.out.println(RetrievedEmployees);

        return RetrievedEmployees;
    };
}
