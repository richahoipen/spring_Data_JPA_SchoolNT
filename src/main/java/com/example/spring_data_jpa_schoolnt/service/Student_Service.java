package com.example.spring_data_jpa_schoolnt.service;

import com.example.spring_data_jpa_schoolnt.entities.Student;
import com.example.spring_data_jpa_schoolnt.i_respo.Student_Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student_Service {
    private final Student_Query student_query;
    @Autowired
    public Student_Service(Student_Query student_query) {
        this.student_query = student_query;
    }
    public List<Student> getAllStudents() {
        return student_query.findAll();
    }
    public boolean addStudent(Student newStudent) {
        try {
            student_query.save(newStudent);
            return true;
        } catch (Exception e) {
            // Xử lý ngoại lệ hoặc ghi log nếu cần thiết
            System.out.println(e.getMessage());
            return false;
        }
    }
}
