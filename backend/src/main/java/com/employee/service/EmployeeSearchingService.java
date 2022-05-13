package com.employee.service;

import com.employee.entity.Employee;
import com.employee.exception.NotFoundException;
import com.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class EmployeeSearchingService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> searchEmployee(String search){
        List<Employee> employee = employeeRepository.findEmployee(search);
        if(employee.isEmpty() || employee==null){
            throw new NotFoundException("employee doesn't exist");
        }
       return employee;
    }

}
