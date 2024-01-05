package com.example.spring_data_jpa_schoolnt;

import com.example.spring_data_jpa_schoolnt.entities.Account_Student;
import com.example.spring_data_jpa_schoolnt.entities.Course;
import com.example.spring_data_jpa_schoolnt.entities.Student;
import com.example.spring_data_jpa_schoolnt.i_respo.Account_StudentRepository;
import com.example.spring_data_jpa_schoolnt.i_respo.CourseRepository;
import com.example.spring_data_jpa_schoolnt.i_respo.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDataJpaSchoolNtApplication
{
    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaSchoolNtApplication.class, args);
    }
    @Transactional
    @Bean
    public CommandLineRunner run(StudentRepository studentRepository, CourseRepository courseRepository, Account_StudentRepository account_studentRepository) throws Exception{

        return (args -> {
            //Tạo dữ liệu
            Student student_1= new Student("Ben",10);
            Student student_2= new Student("Tom",10);
            Student student_3= new Student("Mark",10);
            Account_Student account_student1=new Account_Student("Ben123","123");
            Account_Student account_student2=new Account_Student("Tom123","123");
            Account_Student account_student3=new Account_Student("Mark123","123");

            Course course_1=new Course("DS",10000.5);
            //Liên kết
            course_1.getListStudent().add(student_1);
            course_1.getListStudent().add(student_2);
            course_1.getListStudent().add(student_3);
            student_1.setCourse(course_1);
            student_2.setCourse(course_1);
            student_3.setCourse(course_1);
            //Account_Student 1-1 Student
            student_1.setAccount_student(account_student1);
            account_student1.setStudent(student_1);
            student_2.setAccount_student(account_student2);
            account_student2.setStudent(student_2);
            student_3.setAccount_student(account_student3);
            account_student3.setStudent(student_3);
            //Save Student
            //studentRepository.save(student_1);
            //studentRepository.save(student_2);
            //studentRepository.save(student_3);
            //Save Course
            courseRepository.save(course_1);
            /*
            account_studentRepository.save(account_student1);
            account_studentRepository.save(account_student2);
            account_studentRepository.save(account_student3);*/
        });

    }

}
