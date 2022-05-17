package com.employee.repository;

import com.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee,String> {
        @Query("select e from Employee e where concat(lower(e.id),lower(e.fullName),lower(e.department),lower(e.email),lower(e.structure),lower(e.speciality)) like lower(concat('%', ?1,'%'))")
        List<Employee> findEmployee(String searchElement);
}
