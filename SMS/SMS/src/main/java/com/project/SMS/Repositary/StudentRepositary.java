package com.project.SMS.Repositary;

import com.project.SMS.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositary extends JpaRepository<Student,Long> {

}
