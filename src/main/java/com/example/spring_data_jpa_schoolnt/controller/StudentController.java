package com.example.spring_data_jpa_schoolnt.controller;

import com.example.spring_data_jpa_schoolnt.entities.Student;
import com.example.spring_data_jpa_schoolnt.service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import java.util.List;

@Controller
public class StudentController {

    private final Student_Service studentService;

    @Autowired
    public StudentController(Student_Service studentService) {
        this.studentService = studentService;
    }


    public String getAllStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "students"; // Tên trang HTML mà bạn đã tạo (students.html)
    }
}


