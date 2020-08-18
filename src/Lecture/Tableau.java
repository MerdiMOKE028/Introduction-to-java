/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture;

import java.util.Scanner;

/**
 *
 * @author MOKE
 */ 
public class Tableau {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n;
        String nom;
        String [] produit ;
        int qte, prix;
        
        Scanner Sc = new Scanner(System.in);
        System.out.println("Saisir votre nom :");
        nom=Sc.nextLine();
        try {
            do { System.out.println("Saisir les nombres des articles :");
                n=Sc.nextInt();
                } while (n<=0);
                Sc.nextLine();
            produit = new String [n];
            for (int i = 0; i < produit.length; i++) { 
            System.out.println("Saisir le nom de l'article " + (i+1) + ":");
            nom=Sc.nextLine();
            }  
            for (int i = 0; i < produit.length; i++) {
                do {System.out.println("intro la quantité de l'article " + (i+1)+ ":");                 
                qte = Sc.nextInt();   
                } while (qte<=0);
            }
            for (int i = 0; i < produit.length; i++) {
                do {System.out.println("Saisir le prix de l'article " + (i+1) + ":");
                prix = Sc.nextInt();
                } while (prix<=0);
            }
            System.out.println("Votre enregistrement se fait avec succes");
             } catch (Exception e) {
    System.out.println("UNE ERREUR S'EST PRODUITE");
      }
    }
}
        