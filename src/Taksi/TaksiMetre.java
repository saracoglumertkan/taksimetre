package Taksi;

import java.util.Scanner;

        public class TaksiMetre {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double tutar, mesafe;
        int acilis = 10;
        int min = 20;
            System.out.println("Gidilen yolu giriniz:");
            mesafe = input.nextDouble();
            tutar = mesafe * 2.20 + acilis;
             boolean ib = tutar>min;
             double son = ib ? tutar : min;
            System.out.println(son);

            }


    }

