package com.testsystem.dto;

/**
 * Created by roman.ali on 8/24/2022.
 */
public class EmployeeDptDto {
    private long departmentId;
    private String shortName;
    private String employeeName;

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDepartmentName() {
        return employeeName;
    }

    public void setDepartmentName(String employeeName) {
        this.employeeName = employeeName;
    }
}
