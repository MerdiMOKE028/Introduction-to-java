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
public class Facturation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Maison Mercia & Fils");
        System.out.println("");

        String nom;
        int qte, pu;
        double tva, tota, tot, net;
        double tot1, tot2, tot3;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Saisir votre nom");
            nom = sc.nextLine();
            do {
                System.out.print("Introduire la quantité de jus: ");
                System.out.println("600fc/pc");
                qte = sc.nextInt();
                pu = 600;
                tot1 = pu * qte;
            } while (qte <= 0);

            do {
                System.out.print("Introduire la quantité de pomme: ");
                System.out.println("800fc/pc");
                qte = sc.nextInt();
                pu = 800;
                tot2 = pu * qte;
            } while (qte <= 0);

            do {
                System.out.print("Introduire la quantité de gateau: ");
                System.out.println("700fc/pc");
                qte = sc.nextInt();
                pu = 700;
                tot3 = pu * qte;
            } while (qte <= 0);

            System.out.println("====================================");
            tot = tot1 + tot2 + tot3;
            System.out.println("Montant HT: " + tot);
            tva = 0.16;
            tota = tot * 0.16;
            System.out.println("Montant TVA: " + tota);
            net = tot + tota;
            System.out.println("Montant TTC " + net);

            System.out.println("===================================");

            if (tot >= 5000 && tot < 10000) {
                tot = tot - tot * 0.05 + tota;
                System.out.println("Le total avec 5% de réduction est : " + tot);
            } else if (tot > 10000 && tot <= 20000) {
                tot = tot - tot * 0.15 + tota;
                System.out.println("Le total avec 5% de réduction est : " + tot);
            } else if (tot >= 20000) {
                tot = tot - tot * 0.20 + tota;
                System.out.println("Le total avec 5% de réduction est : " + tot);
            }

        } catch (Exception ex) {
            System.out.println("Une erreur s'est produite !");
            return;
        }
        System.out.println("Maison Mercia & Fils");
        System.out.println("24 Bis, Barumbi Yolo-sud2/Kalamu");
        System.out.println("merdimoke040@gmail.com");

    }

}
