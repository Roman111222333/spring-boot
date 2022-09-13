package com.testsystem.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by roman.ali on 8/24/2022.
 */
@Entity
@Table (name = "department")

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "department_id")
    private long departmentId;

    @Column(name = "department_name")
    private String departmentName;

//    @OneToMany(mappedBy="department", cascade={CascadeType.ALL})
//    private List<Employee> employeeDpts;
@OneToMany(cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        mappedBy = "department")
@JsonManagedReference
private Set<Employee>    employeeSet;


    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
    //    public List<Employee> getEmployeeDpts() {
//        return employeeDpts;
//    }
//
//    public void setEmployeeDpts(List<Employee> employeeDpts) {
//        this.employeeDpts = employeeDpts;
//    }
}

