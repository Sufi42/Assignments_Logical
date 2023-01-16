package com.assignments;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class FindLargestNumber {
    static  int numOne , numTwo, numThree;
    static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        System.out.println("Enter first Number : ");
        numOne= sc.nextInt();
        System.out.println("Enter Second Number : ");
        numTwo= sc.nextInt();
        System.out.println("Enter Third Number : ");
        numThree= sc.nextInt();

        System.out.println("Largest Number is : "+checkLargest());


    }
    public static int checkLargest(){
        if (numOne > numTwo && numOne > numThree){
            return numOne;

            } else if (numThree > numOne && numThree > numTwo) {
                return numThree;


            }
        else{
            return numTwo;
        }
    }
}
