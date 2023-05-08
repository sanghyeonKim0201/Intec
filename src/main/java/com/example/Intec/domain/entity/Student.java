package com.example.Intec.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {

    @Id
    @Column(name = "st_email")
    private String email;
    @Column(name = "st_name")
    private String name;
    @Column(name = "st_phone")
    private String phone;
    @Column(name = "st_school")
    private String school;
    @Column(name = "st_grade")
    private int grade;
    @Column(name = "st_class")
    private int classNo;
    @Column(name = "st_number")
    private int number;
    @Column(name = "st_password")
    private String password;

    @Builder
    public Student(String email, String name, String phone, String school, int grade, int classNo, int number, String password){
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.school = school;
        this.grade = grade;
        this.classNo = classNo;
        this.number = number;
        this.password = password;
    }
}
