package com.example.spring_data_jpa_schoolnt.i_respo;

import com.example.spring_data_jpa_schoolnt.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student_Query extends JpaRepository<Student, Long> {
}
