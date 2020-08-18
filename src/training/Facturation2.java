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
public class Facturation2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Maison Mercia & Fils");
        System.out.println("");

        String nom;
        int qte, pu = 0;
        double tva, tota, tot, net;
        double tot1, tot2, tot3;

        String products[] = {"jus", "pomme", "gateau","biscuit"};
        double prices[] = {600, 700, 800, 100};

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Saisir votre nom:");
            nom = sc.nextLine();

            tot = 0;
            String txt = "";
            for (int i = 0; i < products.length; i++) {
                do {
                    qte = 0;
                    try {
                        System.out.println(String.format("Introduire la qte (>0) de %s (%.0f FC/PCs):", products[i],prices[i]));
                        if (sc.hasNextInt()) {
                            qte = sc.nextInt();
                        } else {
                            sc.nextLine();
                            continue;
                        }

                    } catch (Exception e) {
                        e.printStackTrace();

                    }

                } while (qte <= 0);

                tot += prices[i] * qte;

            }
            System.out.println("====================================");
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
