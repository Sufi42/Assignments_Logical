package com.assignments;

import java.util.Scanner;

public class SwapNumbers {
    static  int a;
    static  int b;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter first Number :  ");
        a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        b= sc.nextInt();

        a=b-a;
        b=b-a;
        a=a+b;

        System.out.println("After Swapping : NumberOne = "+a+" NumberTwo = "+b);



    }
}
