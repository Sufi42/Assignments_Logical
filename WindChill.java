package com.assignments;

import java.util.Scanner;

public class WindChill {
    static double v;
    static double f;

    static void windChill(double f, double v){
        double w = 35.74 + 0.6215 * f + (0.4275*f - 35.75)*Math.pow(v,0.16);
        System.out.println(w);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Fareenheit : ");
         f = sc.nextDouble();
        System.out.println("Wind Speed in iles per hour : ");
        v = sc.nextDouble();

        if(f > 50 || v > 120 || v < 3){
            System.out.println("Values not in range  ");
        }
        else{
            windChill(f,v);
        }


    }
}
