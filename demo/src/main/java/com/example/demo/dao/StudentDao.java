package com.example.demo.dao;

import com.example.demo.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author zhugexiu
 */
public interface StudentDao {

    Optional<Student> selectStudentById(UUID id);

    /**
     * 全部学生
     * @return
     */
    List<Student> selectAllStudents();

    int insertStudent(Student student);

    int updateStudent(Student student);

    int deleteStudentById(UUID id);

}
