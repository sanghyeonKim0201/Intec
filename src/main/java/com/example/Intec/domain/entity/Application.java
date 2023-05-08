package com.example.Intec.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@Table(name = "application")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_no")
    private Long no = 0L;

    @ManyToOne
    @JoinColumn(name = "le_no")
    private Lecture lecture;

    @ManyToOne
    @JoinColumn(name = "st_email")
    private Student student;

    @Builder
    public Application(Long no, Lecture lecture, Student student){
        this.no = no;
        this.lecture = lecture;
        this.student = student;
    }
}
