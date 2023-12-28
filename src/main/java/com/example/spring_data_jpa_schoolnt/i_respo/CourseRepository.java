package com.example.spring_data_jpa_schoolnt.i_respo;

import com.example.spring_data_jpa_schoolnt.entities.Course;


import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {
}

