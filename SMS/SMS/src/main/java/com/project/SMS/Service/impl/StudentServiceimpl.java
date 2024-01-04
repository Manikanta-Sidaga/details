package com.project.SMS.Service.impl;

import com.project.SMS.Entity.Student;
import com.project.SMS.Repositary.StudentRepositary;
import com.project.SMS.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StudentServiceimpl implements StudentService {
    private StudentRepositary studentRepositary;

    public StudentServiceimpl(StudentRepositary studentRepositary) {
        this.studentRepositary = studentRepositary;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepositary.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepositary.save(student);
    }
}
