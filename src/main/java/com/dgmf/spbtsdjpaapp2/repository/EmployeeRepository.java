package com.dgmf.spbtsdjpaapp2.repository;

import com.dgmf.spbtsdjpaapp2.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
