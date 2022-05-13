package com.employee.vm;

import com.employee.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeVM {
    private String id;

    private String fullName;

    private String department;

    private String structure;

    private String speciality;

    private String email;
    public EmployeeVM(Employee employee){
        this.id=employee.getId();
        this.fullName=employee.getFullName();
        this.department=employee.getDepartment();
        this.speciality=employee.getSpeciality();
        this.structure=employee.getStructure();
        this.email=employee.getEmail();
    }

}
