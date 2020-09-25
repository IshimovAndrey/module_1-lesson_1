package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Введите первое число а= ");
        a = scanner.nextInt();
        System.out.println("Введите второе число в= ");
        b = scanner.nextInt();
        if (a > b) {
            System.out.println("число a-"+a+" больше b-"+b);
        } else if (a < b) {
            System.out.println("число b-"+b+" больше a"+a);
        } else{
            System.out.println("числа a&b равны");
        }

        }
    }
