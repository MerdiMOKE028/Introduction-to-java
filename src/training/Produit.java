/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training;

/**
 *
 * @author djk
 */
public class Produit {
    
    private String name;
    private int qteavailable;
    private double price;

    
     public Produit() {
        
    }
     
     
    public Produit(String name, int qteavailable, double price) {
        this.name = name;
        this.qteavailable = qteavailable;
        this.price = price;
    }
    
   

    public String getName() {
        return name;
    }

    public int getQteavailable() {
        return qteavailable;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQteavailable(int qteavailable) {
        
        this.qteavailable = qteavailable;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
   
    
    
    
    
    public void initialize(String name, int qteavailable, double price){
        this.name = name;
        this.qteavailable = qteavailable;
        this.price = price;
    }
    
    public String describe(){
        return String.format("Nom : %s | Prix : %f | Qte : %d", this.name, this.price, this.qteavailable);
        
        
    }
    
}
