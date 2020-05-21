package com.database.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.database.Model.Student;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
