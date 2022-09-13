package com.testsystem.repository;

import com.testsystem.enums.EmployeeStatus;
import com.testsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by roman.ali on 8/17/2022.
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
     Employee findByEmail(String email);


    //List<Employee> findByEmail(String Email)
    //public getEmail(String email);

    public String deleteByName(String name);

    List <Employee> findByStatus( EmployeeStatus employeeStatus);

    //List<Employee> getAllEmployee();
    // public String
    @Query(value = "SELECT * FROM employees", nativeQuery = true)
    List<Employee> getEmployyee();
    @Query(value = "SELECT * FROM employees e WHERE e.name =:name", nativeQuery = true)

    Employee findByName(String name);


    // List<Employee> getALlEmployee();
}
