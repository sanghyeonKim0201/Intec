package com.example.Intec.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@Entity(name = "application")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private Long no = 0L;
    @ManyToOne
    @JoinColumn(name = "lecture")
    private Lecture lecture;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "phone")
    private String phone;
    @Column(name = "parents")
    private String parents;
    @Column(name = "birth")
    private LocalDate birth;
    @Column(name = "school")
    private String school;
    @Builder
    public Application(Long no, Lecture lecture,String name, String gender, String phone, String parents, LocalDate birth, String school){
        this.no = no;
        this.lecture = lecture;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.parents = parents;
        this.birth = birth;
        this.school = school;
    }
}
