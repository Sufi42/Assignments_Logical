package com.assignments;

import java.util.Scanner;

public class EvenOdd {
    static int num;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Number you wantg to check : ");
        num = sc.nextInt();

        if(checkEvenOdd() == true){
            System.out.println(num+" :  is an even number  ");
        }
        else{
            System.out.println(num+" : is an odd number ");
        }

    }
    public static boolean checkEvenOdd(){
        if(num % 2 == 0) {
            return true;

        }
        else{
            return false;

        }
    }
}
