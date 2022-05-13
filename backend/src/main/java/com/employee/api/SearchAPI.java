package com.employee.api;

import com.employee.exception.NotFoundException;
import com.employee.service.EmployeeSearchingService;
import com.employee.vm.EmployeeVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController

public class SearchAPI {

    @Autowired
    EmployeeSearchingService searchingService;

    @GetMapping("/api/employee")
    public List<EmployeeVM> searchEmployee(@RequestParam String search){
        if(search==null || search.isEmpty()){
         return null;
        }
        return searchingService.searchEmployee(search).stream().map(EmployeeVM::new).collect(Collectors.toList());

    }
}
