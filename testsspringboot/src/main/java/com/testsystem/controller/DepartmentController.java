package com.testsystem.controller;

import com.testsystem.dto.DepartmentDto;
import com.testsystem.model.Department;
import com.testsystem.service.imp.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by roman.ali on 8/24/2022.
 */
@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @Autowired

    private DepartmentServiceImpl departmentService;

    @PostMapping("save-department")
    public DepartmentDto saveDepartment(@RequestBody Department departments) {
        Department department = departmentService.saveDepartment(departments);
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setDepartmentName(department.getDepartmentName());
        departmentDto.setDepartmentId(department.getDepartmentId());
        return departmentDto;
      //  departmentDto.setShortName(department.getS);
    }

}


//    EmployeeDpt departmenDto = new EmployeeDpt();
//    departmenDto.setName
//        deDto.setName(byEmail.getName());
//        employeeDto.setAddress((byEmail.getAddress()));
//        return employeeDto;

