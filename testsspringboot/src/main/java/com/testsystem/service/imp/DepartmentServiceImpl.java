package com.testsystem.service.imp;

import com.testsystem.model.Department;
import com.testsystem.repository.DepartmentRepository;
import com.testsystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by roman.ali on 8/24/2022.
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

   @Autowired
   private DepartmentRepository departmentRepository;

//    public List<EmployeeDpt> saveEmployees(List<EmployeeDpt> department) {
//        return departmentRepository.saveAll(department);
//    }

   public List<Department> saveAllDepartment(List<Department> departmentList) {
       return departmentRepository.saveAll(departmentList);
  }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }




//    public EmployeeDpt findByEmployeeId(int employeeId) {
//       EmployeeDpt employeeDpt = employeeDptRepository.findByEmplployeeId(employeeId);
//        return null;
    }

