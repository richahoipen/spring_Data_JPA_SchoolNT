package com.example.spring_data_jpa_schoolnt.i_respo;

import com.example.spring_data_jpa_schoolnt.entities.Student;



import org.springframework.data.repository.CrudRepository;



public interface StudentRepository extends CrudRepository<Student, Long> {

}

