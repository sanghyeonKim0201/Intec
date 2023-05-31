package com.example.Intec.controller;

import com.example.Intec.dto.ApplyDTO;
import com.example.Intec.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;

@RestController
public class ApplicationController {

    @Autowired
    private ApplicationService applicationService;

    private final HttpHeaders headers = new HttpHeaders();
    {
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
    }
    @PostMapping("/api/application")
    public ResponseEntity<?> apply(@RequestBody ApplyDTO applyDTO){
        applicationService.apply(applyDTO);
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
    @DeleteMapping("/api/application")
    public ResponseEntity<?> delete(@RequestBody ApplyDTO applyDTO){
        applicationService.delete(applyDTO);
        return new ResponseEntity<>(headers, HttpStatus.OK);
    }
    @PutMapping("/api/application")
    public ResponseEntity<?> update(@RequestBody ApplyDTO applyDTO){
        //update문 작성 해야함
        return new ResponseEntity<>(headers, HttpStatus.OK);
    }

}
