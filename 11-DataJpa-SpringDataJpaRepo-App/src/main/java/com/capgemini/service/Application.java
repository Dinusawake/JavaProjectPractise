package com.capgemini.service;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.capgemini.service.entity.Employee;
import com.capgemini.service.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context =

				SpringApplication.run(Application.class, args);

		EmployeeRepository repository = context.getBean(EmployeeRepository.class);

		Employee emp = new Employee();
		
		emp.setEmpName("Prashant Dethe");
		emp.setEmpGender("Male");
		emp.setEmpDepartment("It");
		emp.setEmpSalary(1000.0);

		repository.save(emp);
		
		/*
		 * Sort sort = Sort.by("empName", "empSalary").descending();
		 * 
		 * // List<Employe> emps = repository.findAll(sort);
		 * 
		 * int pageNo = 2;
		 * 
		 * PageRequest page = PageRequest.of(pageNo - 1, 2);
		 * 
		 * Page<Employee> findAll = repository.findAll(page);
		 * 
		 * List<Employee> emps = findAll.getContent();
		 * 
		 * emps.forEach(System.out::println);
		 */
	}

}
