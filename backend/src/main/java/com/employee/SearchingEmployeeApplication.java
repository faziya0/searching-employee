package com.employee;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class SearchingEmployeeApplication {
	@Autowired
	EmployeeRepository employeeRepository;
	@PostConstruct
	public void init(){
		for(int i=0;i<10;i++){
			Employee employee = new Employee();
			employee.setId("1111"+i);
			employee.setFullName("Name Surname"+i);
			employee.setDepartment("Name Surname"+i);
			employee.setStructure("Name Surname"+i);
			employee.setSpeciality("Name Surname"+i);
			employee.setEmail("Name Surname"+i);
			employeeRepository.save(employee);


		}
	}

	public static void main(String[] args) {
		SpringApplication.run(SearchingEmployeeApplication.class, args);
	}

}
