package com.assignments;

import java.util.Scanner;

public class VovelsConsonents {
    static char ch;
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter Letter You want to  check : ");
        ch = sc.next().charAt(0);

        if(checkVovel() == true )
        {
            System.out.println(ch+ " : is a vovel ");

        }
        else{
            System.out.println(ch+" : is a consonent");
        }




    }
    public static boolean checkVovel(){
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;

        }
        else{
            return false;
        }
    }
}
