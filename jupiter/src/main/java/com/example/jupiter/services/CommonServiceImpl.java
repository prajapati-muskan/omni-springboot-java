package com.example.jupiter.services;

import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService{
    @Override
    public void overrideTestMeth(){
        System.out.println("overrideTestMeth");
    }

}
