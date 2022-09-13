package com.testsystem.service;

import com.testsystem.dto.EmployeeDto;
import com.testsystem.enums.EmployeeStatus;
import com.testsystem.model.Employee;

import java.util.List;

/**
 * Created by roman.ali on 8/16/2022.
 */

public interface EmployeeService {


   // String getName(String name);

    String getEmail(String email);

    Employee saveEmployee(EmployeeDto employeeDto);

    List<Employee> saveEmployees(List<Employee> employees);

    // String deleteByEmail(String name);

    Employee findByEmail(String email);
    List <Employee> findByStatus( EmployeeStatus employeeStatus);

    String updateEmployeeStatus(String email);


    List<Employee> getEmployee();


    Employee getName(String name);
}

