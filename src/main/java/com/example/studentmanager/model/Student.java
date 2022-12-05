package com.example.studentmanager.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String educationTitle;
    private String phone;
    private String imgUrl;
    @Column(nullable = false, updatable = false)
    private String studentCode;

    public Student() {
    }

    public Student(String name, String email, String educationTitle, String phone, String imgUrl, String studentCode) {
        this.name = name;
        this.email = email;
        this.educationTitle = educationTitle;
        this.phone = phone;
        this.imgUrl = imgUrl;
        this.studentCode = studentCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEducationTitle() {
        return educationTitle;
    }

    public void setEducationTitle(String educationTitle) {
        this.educationTitle = educationTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", educationTitle='" + educationTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
