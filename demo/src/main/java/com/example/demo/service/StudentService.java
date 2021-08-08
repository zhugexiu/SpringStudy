package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    private StudentDao studentDao;

    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Autowired
    /**
     * 和@Repository配对
     */
    public List<Student> getAllStudents() {
        return studentDao.selectAllStudents();
    }

    public int addStudent(Student student) {
        studentDao.insertStudent(student);
        return 1;
    }

    public int updateStudent(Student student) {
        studentDao.updateStudent(student);
        return 1;
    }

    public int deleteStudent(UUID id) {
        return studentDao.deleteStudentById(id);
    }
}
