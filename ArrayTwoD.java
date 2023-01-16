package com.assignments;

import java.util.Scanner;

public class ArrayTwoD {
    public static void main(String[] args) {

        int arr[][] = new int[10][10];
        int M;
        int N;
        int i, j;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        M = sc.nextInt();
        System.out.println("enter Columns : ");
        N = sc.nextInt();
        System.out.println("Enter Elements : ");


        for (i = 0; i < M; i++) {
            for (j = 0; j < N; j++) {

                arr[i][j] = sc.nextInt();
            }
        }

            System.out.println(" The Array is \n ");
            for (i = 0; i < M; i++) {
                for (j = 0; j < N; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();

            }
        }
    }

