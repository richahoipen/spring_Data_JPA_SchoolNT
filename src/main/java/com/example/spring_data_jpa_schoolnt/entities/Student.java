package com.example.spring_data_jpa_schoolnt.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private Long id_Student;

    private String name;
    private int age;

    @ManyToOne
    @JoinColumn(name = "id_Course")
    private Course course;

    public Long getId_Student() {
        return id_Student;
    }

    public void setId_Student(Long id_Student) {
        this.id_Student = id_Student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return "Student{" +
                "id_Student=" + id_Student +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
