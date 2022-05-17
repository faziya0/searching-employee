package com.employee.dto;

import com.employee.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    private String id;

    private String fullName;

    private String department;

    private String structure;

    private String speciality;

    private String email;


}
