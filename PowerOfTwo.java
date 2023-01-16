package com.assignments;

import java.util.Scanner;

public class PowerOfTwo {
    static  int p;

    public static void main(String[] args) {
        double n;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextDouble();

        double result = Math.pow(2, n);

        System.out.println("Power of 2^" +n+ "is  : "+result);

        for(int i = 1; i <= n; i++){
            System.out.println("Traversing till i = n  : "+Math.pow(2,i));
        }
    }
}
