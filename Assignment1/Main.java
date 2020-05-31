/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jewellery;

/**
 *
 * @author nurul annesa
 */
public class Main {
    public static void main(String []args){
                
        Jewellery jw = new Jewellery();
        Necklace n = new Necklace();
        Ring r = new Ring();
        Bracelet b = new Bracelet();
        
        System.out.println("Jewellery:");
        jw.setColor();
        jw.setSurface();
        jw.setMadeOf();
        jw.display();

        System.out.println("\nNecklace:");
        n.setColor();
        n.setSurface();
        n.setMadeOf();
        n.getPrice(10000);
        n.display();

        System.out.println("\nRing:");
        r.setColor();
        r.setSurface();
        r.setMadeOf();
        r.getType(2);
        r.display();
        r.user('b'); 
        r.user(5, 10); 

        System.out.println("\nBracelet:");
        b.setColor();
        b.setSurface();
        b.setMadeOf();
        b.setShape();
        b.display();
        b.disp('i'); 
        b.disp('n', 3);
        
    }
}
