package com.testsystem.repository;

import com.testsystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by roman.ali on 8/24/2022.
 */
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    //Department findById(long departmentId);

}
