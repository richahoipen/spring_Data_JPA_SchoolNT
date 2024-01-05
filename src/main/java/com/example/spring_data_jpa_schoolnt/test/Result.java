package com.example.spring_data_jpa_schoolnt.test;

import com.example.spring_data_jpa_schoolnt.entities.Student;
import com.example.spring_data_jpa_schoolnt.service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Result implements CommandLineRunner {
    private final Student_Service student_service;

    @Autowired
    public Result(Student_Service student_service) {
        this.student_service = student_service;
    }
    @Override
    public void run(String... args) {
        // Xuất dữ liệu ra console khi ứng dụng khởi chạy
        List<Student> listStudents = student_service.getAllStudents();
        int sum_Age=0;
        for (Student student : listStudents) {
            System.out.println(student.toString());
            sum_Age+=student.getAge();
        }
        System.out.println("Sum of age: "+sum_Age);
        student_service.addStudent(new Student("Lisa",10));

    }
}
