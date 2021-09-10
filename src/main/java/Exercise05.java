/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        //create a Scanner
        Scanner input = new Scanner(System.in);
        //prompt the user to input a number
        System.out.print("What is the first number? ");
        int number1 = input.nextInt();
        //prompt the user for a second number
        System.out.print("What is the second number? ");
        int number2 = input.nextInt();
        //now do the calculations and output them
        int add = number1 + number2;
        int sub = number1 - number2;
        int multi = number1 * number2;
        int div = number1 / number2;
        //output the results
        System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d",
                number1, number2, add, number1, number2, sub, number1, number2, multi, number1, number2, div);
    }
}
