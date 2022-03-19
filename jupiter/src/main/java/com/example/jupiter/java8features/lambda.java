package com.example.jupiter.java8features;

import java.lang.Integer;
import java.util.function.BiConsumer;

public class lambda {

    public static void main(String []args){
        BiConsumer<Integer,Integer> biconsumer=(a,b)-> System.out.println(a+b);
        biconsumer.accept(2,3);
    }
}
