package com.company;

public class Triangle {
    int a, b, c;

     public void area(int a, int b, int c){
        double p = (a + b + c) >> 1;
        double square = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(square);
    }
}
