package com.testsystem.controller;

import com.testsystem.dto.EmployeeDto;
import com.testsystem.enums.EmployeeStatus;
import com.testsystem.exception.ResourceNotFoundException;

import com.testsystem.model.Employee;
import com.testsystem.repository.EmployeeRepository;
import com.testsystem.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

//import java.net.URI;
import java.util.List;

/**
 * Created by roman.ali on 8/22/2022.
 */
@RestController
@RequestMapping("/api/employee")


public class EmployeesController {


    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private RestTemplate restTemplate;
    public EmployeesController(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }

    @PostMapping("/email/{email}")
    public EmployeeDto getEmail(@PathVariable String email) {

        Employee byEmail = employeeService.findByEmail(email);
        EmployeeDto employeeDto = mapper.map(byEmail, EmployeeDto.class);
//        EmployeeDto employeeDto = new EmployeeDto();
//        employeeDto.setName(byEmail.getName());
//        employeeDto.setAddress((byEmail.getAddress()));
        return employeeDto;
    }

    @PostMapping("/status/{status}")
    public List<Employee> getEmployeeByStatus(@PathVariable String status) {
        if (status.equals("active"))
            return employeeService.findByStatus(EmployeeStatus.ACTIVE);
        else {
            return employeeService.findByStatus(EmployeeStatus.DEACTIVE);
        }
//        EmployeeDto employeeDto=new EmployeeDto();
//        employeeDto.setName(byEmail.getName());
//        employeeDto.setAddress((byEmail.getAddress()));
//        return employeeDto;
    }


    //    @PostMapping("/name/{name}")
//    public List<Employee> getActiveEmployees(@PathVariable String name) {
//        return EmployeeService.getActiveEmployees(name);
//    }
    @PostMapping("/addEmployee")
    public Employee saveEmployee(@RequestBody EmployeeDto employeeDto) {
        return employeeService.saveEmployee(employeeDto);
    }

    @PostMapping("/addEmployees")
    public List<Employee> saveEmployees(@RequestBody List<Employee> employees) {
        return employeeService.saveEmployees(employees);
    }

    @PutMapping("/update-status/{email}")
    public String updateStatus(@PathVariable String email) {
        return employeeService.updateEmployeeStatus(email);
    }


    @GetMapping("/get-employees")
    public EmployeeDto[] getEmployee() {

        List<Employee> employee = employeeService.getEmployee();
        return mapper.map(employee, EmployeeDto[].class);

    }

    @PostMapping("/get-name/{name}")

    public EmployeeDto getName(@PathVariable String name){
        Employee byName = employeeService.getName(name);
        if(byName == null)
            throw new ResourceNotFoundException(name +" does not exist");
        EmployeeDto employeeDto = mapper.map(byName, EmployeeDto.class);
        return employeeDto;
    }

//    @PreAuthorize("hasAnyRole('ADMIN','MANAGER')")
//    @GetMapping(value = "/employee/{id}")
//    ResponseEntity<Employee> findById(@PathVariable("id")  long id) {
//        Employee emp = employeeRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee with ID :" + id));
//        return ResponseEntity.ok().body(emp);
//    }
//    @PreAuthorize("hasAnyRole('ADMIN','MANAGER')")
//    @PostMapping(value = "/employees")
//    ResponseEntity<?> CreateEmployee(@Validated @RequestBody EmployeeDto empdto) {
//        Employee emp = EmployeeMapper.dtoToEntity(empdto);
//        Employee addedemp = employeeRepository.save(emp);
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(addedemp.getId())
//                .toUri();
//        return ResponseEntity.created(location).build();
//    }
//    @PreAuthorize("hasAnyRole('ADMIN','MANAGER')")
//    @PutMapping(value = "/employee/{id}")
//    ResponseEntity<Employee> updateEmployee(@PathVariable("id")  long id,
//                                            @Validated @RequestBody EmployeeDto empdto) {
//        Employee emp = employeeRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee with ID :" + id));
//        Employee empu = EmployeeMapper.dtoToEntity(empdto);
//        empu.setId(emp.getId());
//        employeeRepository.save(empu);
//        return ResponseEntity.ok().body(empu);
//    }
//    @PreAuthorize("hasAuthority('ROLE_MANAGER')")
//    @DeleteMapping(value = "/employee/{id}")
//    ResponseEntity<String> deleteEmployee(@PathVariable("id")  long id) {
//        Employee emp = employeeRepository.findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Employee Not Found with ID :" + id));
//        employeeRepository.deleteById(emp.getId());
//        return ResponseEntity.ok().body("Employee deleted with success!");
   // }
}



//@PutMapping("/delete/{name}")
//    public String deleteEmployee(@PathVariable String name){
//        employeeService.deleteByName(name);
//        return name;
//    }

