package com.example.Intec.service;

import com.example.Intec.domain.repository.ApplicationRepository;
import com.example.Intec.dto.ApplyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public void apply(ApplyDTO applyDTO){
        var applicationOptional = applicationRepository.findByNameAndBirthAndPhone(applyDTO.getName(), applyDTO.getBirth(), applyDTO.getPhone());
        if(!applicationOptional.isPresent()){
            throw new IllegalStateException("이미 수강신청이 되어있습니다");
        }
        applicationRepository.save(applyDTO.toEntity());
    }
    public void delete(ApplyDTO applyDTO){
        try{
            applicationRepository.delete(applyDTO.toEntity());
        }catch (Exception e){
            throw new IllegalStateException("삭제할 수강이 없습니다");
        }
    }
    public void update(ApplyDTO applyDTO){

    }

}
