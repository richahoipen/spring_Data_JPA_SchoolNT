package com.example.spring_data_jpa_schoolnt.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Account_Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    private Long id_account;
    private String userName;
    private String password;
    @OneToOne
    @JoinColumn(name = "id_Student")
    private Student student;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account_Student)) return false;
        Account_Student that = (Account_Student) o;
        return id_account.equals(that.id_account) && userName.equals(that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_account, userName);
    }

    public Long getId_account() {
        return id_account;
    }

    public void setId_account(Long id_account) {
        this.id_account = id_account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Account_Student() {
    }

    public Account_Student(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

}
