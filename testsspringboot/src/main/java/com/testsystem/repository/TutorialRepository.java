package com.testsystem.repository;

import com.testsystem.model.Employee;
import com.testsystem.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by roman.ali on 8/19/2022.
 */
@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByTitle(String title);
    List<Tutorial> findByPublished(boolean b);
    List<Tutorial> findByTitleContaining(String title);

}
