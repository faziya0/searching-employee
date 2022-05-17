package com.employee.api;

import com.employee.service.EmployeeSearchingService;
import com.employee.dto.EmployeeDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController

public class SearchAPI {

    @Autowired
    EmployeeSearchingService searchingService;
    @Autowired
    ModelMapper modelMapper;

    @GetMapping("/api/employee")
    public List<EmployeeDTO> searchEmployee(@RequestParam String search){
        if(search==null || search.isEmpty()){
         return null;
        }
        return searchingService.searchEmployee(search).stream().map(employee -> modelMapper.map(employee,EmployeeDTO.class)).collect(Collectors.toList());
    }
}
