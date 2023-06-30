package com.dgmf.spbtsdjpaapp2.repository;

import com.dgmf.spbtsdjpaapp2.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    // Query all Employees who have a particular String in their "lastName"
    List<Employee> findEmployeeByLastNameContaining(String str);
}
