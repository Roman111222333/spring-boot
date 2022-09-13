package com.testsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by roman.ali on 8/24/2022.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private long departmentId;
    private String departmentName;
    private String shortName;
    public String getDepartmentName() {
        return departmentName;
    }

}
