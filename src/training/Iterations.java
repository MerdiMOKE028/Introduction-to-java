/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.util.Scanner;

/**
 *
 * @author djk
 */
public class Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Structure iteratives");
        System.out.println("====================");

        System.out.print("Entrer la valeur de N: ");
        int n = new Scanner(System.in).nextInt();

        drawline(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(String.format("|%3d|", i));
        }

        drawline(n);

        for (int i = 1; i <= n; i++) {
            System.out.print(String.format("|%3d|", 2 * i));
        }

        drawline(n);

        System.out.println("Structure iteratives DO WHILE");
        System.out.println("==============================");

        //Lecture valeur positive
        int val;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduire une valeur positive : ");
            val = sc.nextInt();
        } while (val < 0);

    }

    static void drawline(int n) {

        System.out.println("");

        for (int i = 1; i <= 5 * n; i++) {
            System.out.print("-");
        }

        System.out.println("");

        return;
    }

}
