package com.assignments;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        int dividend ;
        int divisor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Dividend : ");
        dividend = sc.nextInt();
        System.out.println("Enter Divisor : ");
        divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient is : "+quotient);
        System.out.println("Remainder is : "+remainder);

    }
}
