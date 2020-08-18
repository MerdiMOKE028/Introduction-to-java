/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author djk
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Produit> produits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        int i = 1;
        do {            
            Produit p = new Produit();
            
            System.out.println("Entrer nom prod " + i + " : ");
            p.setName(sc.nextLine());
            System.out.println("Entrer qte prod " + i + " : ");
            p.setQteavailable(sc.nextInt());
            System.out.println("Entrer prix prod " + i + " : ");
            p.setPrice(sc.nextDouble());
            
            produits.add(p);
            
            i++;
            
            System.out.println("Terminer o/n : ");
            sc.nextLine();
            
        } while (sc.nextLine().equals("n"));
        
        try {
            FileWriter fw = new FileWriter("produits.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (Produit produit : produits) {
//            System.out.println(produit.describe());

                bw.write(produit.describe() + "\n");
            }
            
            bw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(OOP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
