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
    @GetMapping("/api/apply")
    public ResponseEntity<?> apply(@RequestBody ApplyDTO applyDTO){
        applicationService.apply(applyDTO);
        return new ResponseEntity<>(headers, HttpStatus.CREATED).;
    }

}
