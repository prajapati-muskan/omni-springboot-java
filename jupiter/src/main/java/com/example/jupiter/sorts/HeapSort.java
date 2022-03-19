package com.example.jupiter.sorts;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class HeapSort implements SortArray{
    @Override
    public int[] sortArray(int[] nums){
        return nums;
    }

    @PostConstruct
    public void post(){
        System.out.println("post construct");
    }
    @PreDestroy
    public void pre(){
        System.out.println("pre destroy");
    }

}
