package com.capgemini.service.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.service.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    }
