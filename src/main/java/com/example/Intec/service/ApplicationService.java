package com.example.Intec.service;

import com.example.Intec.domain.repository.ApplicationRepository;
import com.example.Intec.dto.ApplyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public void apply(ApplyDTO applyDTO){
        applicationRepository.save(applyDTO.toEntity());
    }

}
