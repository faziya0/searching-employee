package com.employee.repository;

import com.employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee,String> {
        @Query("select e from Employee e where lower(e.id) like lower(concat('%', :searchElement,'%')) or " +
                "lower(e.fullName) like lower(concat('%', :searchElement,'%')) or " +
                "lower(e.department) like lower(concat('%', :searchElement,'%')) or " +
                "lower(e.structure) like lower(concat('%', :searchElement,'%')) or " +
                "lower(e.speciality) like lower(concat('%', :searchElement,'%')) or " +
                "lower(e.email) like lower(concat('%', :searchElement,'%'))")
        List<Employee> findEmployee(@Param("searchElement") String searchElement);
}
