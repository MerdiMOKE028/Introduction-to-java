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
public class ConditionsSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("entrer une valeur entre 0 et 2");
        
        int value = new Scanner(System.in).nextInt();
        
        switch (value){
         case 1:{
             System.out.println("Vous avez entrer 1");
             break;
         }
         case 0:{
             System.out.println("Vous avez entrer 0");
             break;
        }
        case 2:{
             System.out.println("Vous avez entrer 2");
             break;
    
        }
        default:{
            System.out.println("Mauvaise valeur entree");
        }}
        
        
         System.out.println("Operateur ternaire");
         
         
         String value1 = new Scanner(System.in).nextLine();
         
         
         int gender = value1.equals("M")?10:0;
         
//         String formattedvaleu = .format(gender+"", value1);
         
         System.out.println(String.format("Code genre : %04d pour la valeur entree : %s", gender,value1));
         
         
        
        
    }
    
}
