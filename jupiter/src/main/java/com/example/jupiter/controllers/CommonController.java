package com.example.jupiter.controllers;

import com.example.jupiter.services.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
public class CommonController {
    @Autowired
    CommonService commonService;

    @GetMapping(value = "/uploadFile")
    public ResponseEntity<?> uploadFile(@RequestParam MultipartFile multipartFile,
                                        @RequestParam String user) throws IOException {
        return new ResponseEntity<String>(commonService.uploadFile(multipartFile, user), HttpStatus.ACCEPTED);
    }
}
