package com.example.spring_data_jpa_schoolnt.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name="Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private Long id_Course;

    private String name;
    private double price;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private List<Student> listStudent=new ArrayList<>();

    public Long getId_Course() {
        return id_Course;
    }

    public void setId_Course(Long id_Course) {
        this.id_Course = id_Course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public Course() {
    }

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id_Course=" + id_Course +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
