package com.example.spring_data_jpa_schoolnt.i_respo;

import com.example.spring_data_jpa_schoolnt.entities.Account_Student;

import org.springframework.data.repository.CrudRepository;

public interface Account_StudentRepository extends CrudRepository<Account_Student, Long> {
}
