package com.example.Intec.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
@Getter
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "le_no")
    private Long no;

    @Column(name = "le_name")
    private String name;

    @Column(name = "le_limit")
    private int limit;

    @Column(name = "le_sdate")
    private String sdate;

    @Column(name = "le_edate")
    private String edate;

    @ManyToOne
    @JoinColumn(name = "sc_name")
    private School school;

    @Builder
    public Lecture(Long no, String name, int limit, String sdate, String edate, School school){
        this.no = no;
        this.name = name;
        this.limit = limit;
        this.sdate = sdate;
        this.edate = edate;
        this.school = school;
    }
}
