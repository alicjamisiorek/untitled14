

package com.company;

       import java.util.Arrays;
       import java.util.Collections;
       import java.util.Scanner;

public class Main {
           public static void main(String[] args) {
           int[] tab = new int[8];
           Scanner scan = new Scanner(System.in);

           System.out.println("podaj liczby :");

           for (int i=0;i<tab.length;i++)
             {
                   tab[i] = scan.nextInt();

               }
           System.out.print("[");
           for(int i=0;i<tab.length;i++)
               {
                   System.out.print(tab[i]+" ");
               }

           System.out.print("]");
               System.out.println();
               System.out.println("Tablica posortowana:");
           Arrays.sort(tab);
               System.out.println(Arrays.toString(tab));











           }
       }







