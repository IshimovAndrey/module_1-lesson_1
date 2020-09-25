package com.company;

import java.util.Scanner;

public class exercise_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter integer number");
        int n = scanner.nextInt();
        if (n > 0) {
            System.out.println(n+" - positive число");
        } else if (n < 0) {
            System.out.println(n+ " - negative число");
        } else {
            System.out.println(n+" = 0");
        }
        if (n % 2 == 0) {
            System.out.println(n+" even number");
        } else {
            System.out.println(n+" odd number");
        }

    }
}
