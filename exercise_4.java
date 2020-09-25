package com.company;

import java.util.Scanner;

class exercise_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите год: ");
        int year = scan.nextInt();
        if ((year % 4 == 0)||(year%150==0)) {
            System.out.println(year + "год высокосный");
        }
        else {
            System.out.println(year+ "год не высокосный");
        }

    }
}
