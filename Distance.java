package com.assignments;

import java.util.Scanner;

public class Distance {

    static double a,b;

    static Scanner sc = new Scanner(System.in);

    public static double calDistance(double a, double b){

        double distance = Math.sqrt(a*a + b*b);
        return distance;


    }


    public static void main(String[] args) {
        System.out.println("Enter Vslue of a And B");
        a= sc.nextDouble();
        b = sc.nextDouble();

        calDistance(a,b);

        System.out.println("Distance is  : "+calDistance(a,b));



    }
}
