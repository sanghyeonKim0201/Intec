package com.example.Intec.dto;

import com.example.Intec.domain.entity.Application;
import com.example.Intec.domain.entity.Lecture;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class ApplyDTO {

    private Long no = 0L;
    private Lecture lecture;
    private String name;
    private String gender;
    private String phone;
    private String parents;
    private LocalDate birth;
    private String school;

    public Application toEntity(){
        Application application = Application.builder()
                .no(no)
                .lecture(lecture)
                .name(name)
                .gender(gender)
                .phone(phone)
                .parents(parents)
                .birth(birth)
                .school(school)
                .build();
        return application;
    }
    @Builder

    public ApplyDTO(Long no, Lecture lecture, String name, String gender, String phone, String parents, LocalDate birth, String school) {
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
