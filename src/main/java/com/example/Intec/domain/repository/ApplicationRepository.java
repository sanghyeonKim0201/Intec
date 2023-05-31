package com.example.Intec.domain.repository;

import com.example.Intec.domain.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

    Optional<Application> findByNameAndBirthAndPhone(String name, LocalDate birth, String phone);
}
