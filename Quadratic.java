package com.assignments;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Quadratic {
    static void findRoots(int a , int b ,int c){
        int delta =Math.abs( b*b -4*a*c);
        double rootOne = (-b+Math.sqrt(delta)/2*a);
        System.out.println(rootOne);
        double rootTwo = (-b-Math.sqrt(delta)/2*a);
        System.out.println(rootTwo);



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter Value of  b : ");
        int b = sc.nextInt();
        System.out.println("Enter Value of c : ");
        int c = sc.nextInt();
        findRoots(a,b,c);

    }
}
