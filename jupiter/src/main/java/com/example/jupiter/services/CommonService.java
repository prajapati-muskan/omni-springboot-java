package com.example.jupiter.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CommonService {
    public String uploadFile(MultipartFile file, String user) throws IOException;

    public void overrideTestMeth();
}
