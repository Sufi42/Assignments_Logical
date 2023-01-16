package com.assignments;

import java.util.Scanner;

public class LeapYear {
   static int year;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter Year You want to check : ");
        year = sc.nextInt();

        if(( year % 4 == 0) && ( year % 100 != 0 )||( year % 400 == 0) ){
            System.out.println(year+"Is an Leap Year");
        }
        else{
            System.out.println(year+" : Is not an Leap Year");
    }

    }
}
