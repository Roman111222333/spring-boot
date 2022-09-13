package com.testsystem.service.imp;

import com.testsystem.dto.EmployeeDto;
import com.testsystem.enums.EmployeeStatus;
import com.testsystem.exception.ResourceNotFoundException;
import com.testsystem.model.Department;
import com.testsystem.model.Employee;
import com.testsystem.repository.DepartmentRepository;
import com.testsystem.repository.EmployeeRepository;
import com.testsystem.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by roman.ali on 8/16/2022.
 */

@Service
class EmployeeServiceImpl implements EmployeeService {

    @Autowired
   private EmployeeRepository employeeRepository;
    @Autowired
   private ModelMapper modelMapper;
    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public String getEmail(String email) {
        return getEmail(email);
    }

//

    //@Override
  //  public String getName(String name) {
      //  return getName(name);
    //}
//convert dto to entitiy


    private Employee convertDtoToEntity(EmployeeDto employeeDto) {
        Optional<Department> department;
        department = departmentRepository.findById(employeeDto.getDepartmentId());


        Employee employee = this.modelMapper.map(employeeDto, Employee.class);
        employee.setDepartment(department.get());
        if (department == null) {
            throw new ResourceNotFoundException("Department does not exist");
        }
        return employee;

        //MAnual method for convert dto to Entity
//        Employee employee = new Employee();
//        employee.setName(employeeDto.getName());
//        employee.setEducation(employeeDto.getEducation());
//        employee.setAddress(employeeDto.getAddress());
//        employee.setEmail(employeeDto.getEmail());
//        employee.setStatus(employeeDto.getStatus());
//        return employee;
    }

    //create operation
    @Override
    public Employee saveEmployee(EmployeeDto employeeDto) {
        Employee employee = convertDtoToEntity(employeeDto);
        return employeeRepository.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }


    @Override
    public Employee findByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    public List<Employee> findByStatus(EmployeeStatus employeeStatus) {
        return employeeRepository.findByStatus(employeeStatus);
    }
    //read operatin


//    //Delete employee
//    public String deleteEmployee(String name) {
//        employeeRepository.deleteByName(name);
//        return name;
//    }


    public String updateEmployeeStatus(String email) {
        String message = "";
        Employee employee = employeeRepository.findByEmail(email);
        try {
            if (employee != null) {
                employee.setStatus(EmployeeStatus.DEACTIVE);
                employeeRepository.save(employee);
                message = "Success";
            } else {
                message = "Employee Not Found with given email " + email;
            }
        } catch (Exception e) {
            message = "Error " + e.getMessage();
        }
        return message;
    }


    @Override
    public List<Employee> getEmployee() {
        return employeeRepository.getEmployyee();
    }

    @Override
    public Employee getName(String name) {
        return employeeRepository.findByName(name);
    }


    //update operation
//    public ProductServiceImpl(Employee employee){
//        Employee existingEmployee = employeeRepository.findById(employee.getId());
//        existingEmployee.setName(employee.getName());
//        existingEmployee.setEmail(employee.getEmail());
//        existingEmployee.setAddress(employee.getAddress());
//        existingEmployee.setEducation(employee.getEducation());
//        return EmployeeRepository.save(existingEmployee);
//    }


//   public List<Employee> allEmployee=employeeRepository.getALlEmployee(){
//
//
//     }


}






