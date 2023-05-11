package com.example.Intec.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "lecture")
@Getter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "no")
    private Long no = 0L;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "school")
    private School school;
    @Column(name = "`limit`")
    private int limit;
    @Column(name = "requestSdate")
    private LocalDate requestSdate;
    @Column(name = "requestEdate")
    private LocalDate requestEdate;
    @Column(name = "trainingSdate")
    private LocalDate trainingSdate;
    @Column(name = "trainingEdate")
    private LocalDate trainingEdate;
    @Column(name = "explanation")
    private String explanation;
    @Column(name = "target")
    private String target;
    @Builder
    public Lecture(Long no, String name, School school, int limit, LocalDate requestSdate, LocalDate requestEdate, LocalDate trainingSdate, LocalDate trainingEdate, String explanation, String target){
        this.no = no;
        this.name = name;
        this.school = school;
        this.limit = limit;
        this.requestSdate = requestSdate;
        this.requestEdate = requestEdate;
        this.trainingSdate = trainingSdate;
        this.trainingEdate = trainingEdate;
        this.explanation = explanation;
        this.target = target;
    }
}