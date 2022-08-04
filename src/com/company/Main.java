package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Triangle triangle = new Triangle();
        Scanner in = new Scanner(System.in);
        System.out.print("a: ");
        triangle.a = in.nextInt();
        System.out.print("b: ");
        triangle.b = in.nextInt();
        System.out.print("c: ");
        triangle.c = in.nextInt();

        triangle.area(triangle.a, triangle.b, triangle.c);
    }
}
