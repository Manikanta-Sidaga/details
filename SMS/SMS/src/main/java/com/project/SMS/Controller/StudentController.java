package com.project.SMS.Controller;

import com.project.SMS.Entity.Student;
import com.project.SMS.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    //handler to get view of all students using model
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }
    //handler to get the view of create student page using button

    @GetMapping("/students/new")
    public String createStudentForm(Model model){
        //creating student object for holding entered value thorugh form
        Student student=new Student();
        model.addAttribute("student",student);
        return "Create_Student";
    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

}
