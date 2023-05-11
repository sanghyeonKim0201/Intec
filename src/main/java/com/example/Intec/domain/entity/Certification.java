package com.example.Intec.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity(name = "certification")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
@Getter
public class Certification {
    @Id
    @Column(name = "phone")
    private String phone;
    @Column(name = "number")
    private int number;

    @Builder
    public Certification(String phone, int number){
        this.phone=  phone;
        this.number = number;
    }


}
