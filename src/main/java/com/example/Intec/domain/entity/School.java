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
public class School {
    @Id
    @Column(name = "sc_name")
    private String name;

    @Column(name =  "sc_email")
    private String email;

    @Column(name = "sc_password")
    private String password;

    @Builder
    public School(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
