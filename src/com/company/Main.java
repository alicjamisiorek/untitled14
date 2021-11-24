


package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*Scanner scan = new Scanner(System.in);
        System.out.println("Jakiej liczby szukamy?:");
        int liczba =scan.nextInt(); */

        int[] pierwszaTablica = {1, 2, 3, 4, 5};
        int[] drugaTablica = {1, 2, 3, 4, 6,7};

        if (pierwszaTablica.length != drugaTablica.length) {
            System.out.println("różny rozmiar Tabli");

        } else {
            boolean czyRozne = false;

            for (int i = 0; i < pierwszaTablica.length; i++) {
                if (pierwszaTablica[i] != drugaTablica[i]) {
                    czyRozne = true;
                }
            }
            if (czyRozne) {
                System.out.println("rożne elementy Tablicy");
            } else {
                System.out.println("Tablice takie same");
            }
        }
    }
}