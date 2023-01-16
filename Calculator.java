package com.assignments;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int num1 ,num2;
       Scanner sc = new Scanner(System.in);
        int choice;
        choice=0;


        while (choice != 5) {
            System.out.println("Enter first number");
            num1 = sc.nextInt();
            System.out.println("Enter Second Number ");
            num2 = sc.nextInt();


            System.out.println("Show Menu");
            System.out.println(" 1:Add 2:Sub 3:Mul 4:Div 5:Exit");

            System.out.println("Your Choice : ");
            choice = sc.nextInt();
            System.out.println();

            //SOLID
            switch (choice) {

                case 1:

                    System.out.println("Addition of " + num1 + " + " + num2 + " : " + add(num1, num2));
                    break;

                case 2:
                    System.out.println(" Subtraction of " + num1 + " - " + num2 + " : " + sub(num1, num2));
                    break;


                case 3:
                    System.out.println("Multiplication of " + num1 + " * " + num2 + "  : " + mul(num1, num2));
                    break;


                case 4:

                    System.out.println("Division of " + num1 + " / " + num2 + " : " + div(num1, num2));
                    break;

                case 5:
                    System.out.println("You chose to exit : ");
                    break;
            }

        }
    }

    public static int add(int num1 ,int num2){
        return num1+num2;
    }
    public static int sub(int num1, int num2){
        return num1-num2;
    }
    public static int mul(int num1, int num2){
        return num1*num2;
    }
    public static int div(int num1, int num2){
        return num1/num2;

    }
}
