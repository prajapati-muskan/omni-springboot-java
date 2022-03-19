package com.example.jupiter.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

@Service
public class CommonServiceImpl implements CommonService {
    @Override
    public void overrideTestMeth() {
        System.out.println("overrideTestMeth");
    }

    @Override
    public String uploadFile(MultipartFile file, String user) throws IOException {
        File localFile= new File("src/main/java/resources/fromMultipart");
        file.transferTo(localFile);
        return new String();
    }
}
