package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi;
        double i;
        double result=0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi gir: ");
        sayi = input.nextInt();

        for (i=1;i<=sayi;i++) {
            result +=(1/i);

        }
        System.out.println("Harmonik sayıların toplamı: "+result);
    }
}
