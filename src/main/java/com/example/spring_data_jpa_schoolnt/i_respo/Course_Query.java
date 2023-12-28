package com.example.spring_data_jpa_schoolnt.i_respo;

import com.example.spring_data_jpa_schoolnt.entities.Course;
import com.example.spring_data_jpa_schoolnt.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Course_Query extends JpaRepository<Course, Long> {
}
