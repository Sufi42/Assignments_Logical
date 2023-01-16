package com.assignments.coinflip;

import java.util.Random;
import java.util.Scanner;

public class Coinflip {

    static double Heads;
    static double Tails;
    static int head = 0;
    static int tail = 0;
    static int input;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter Number of times you want coins to flip");
        input = sc.nextInt();

        for (int i = 0; i < input; i++) {

            Random r = new Random();
            int flip = r.nextInt(2);

            if (flip < 0.5) {
                tail++;
            } else {
                head++;
            }
        }
        System.out.println("Tails Count : " + tail);
        System.out.println("Heads Count : " + head);

        System.out.println("Percentage of Tails Over Head : " + heads() + " %");
        System.out.println("Percentage Of Heads Over TAils : " + tails() + " %");

    }

    public static double heads() {
        Heads = (head / (double) input) * 100;
        return Heads;
    }

    public static double tails() {
        Tails = (tail / (double) input) * 100;
        return Tails;
    }
}
