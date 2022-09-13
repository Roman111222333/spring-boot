package com.testsystem.dto;


//Employee Crud Operation
//Create /Save Employee // 1 email k 2 employee nai hoite
// Read / Get Emplpyee by email // Get Emplpoyee info based on email
// Get All employee //
//Update Employee // siwae email aur id k sab update
//Delete Employee 1 emmployee delete 0 eployyee avaide

// workbenach install mysql
// employee..

import com.fasterxml.jackson.annotation.JsonInclude;
import com.testsystem.enums.EmployeeStatus;

/**
 * Created by roman.ali on 8/17/2022.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeDto {
   private long id;
    private String name;
   private String email;
  private String address;
   private String education;
    private EmployeeStatus status;
private long departmentId;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }
}

