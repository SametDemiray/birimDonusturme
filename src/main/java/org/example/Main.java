package org.example;

import java.util.Scanner;

public class Main {
    // Metre cinsinden girilen uzunluğu, seçilen birime dönüştüren program
    public static void main(String[] args) {

        float a,b;
        int sec;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uzunluğu giriniz (m) : ");
        a=scanner.nextFloat();
        System.out.printf("\nDönüştürme\n1- mm\n2- cm\n3- dm\n4- km\n");
        System.out.print("\nSeçiminiz : ");
        sec=scanner.nextByte();
        switch (sec)
        {
            case 1: {b = 1000 * a; break;}
            case 2: {b = 100 * a; break;}
            case 3: {b = 10 * a; break;}
            case 4: {b = a / 1000; break;}
            default:{b = 0; break;}
        }
        System.out.printf("Sonuc : %.5f\n",b);


    }
}