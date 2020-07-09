/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author nurul annesa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*Animals[] animals;
        int i;

        animals = new Animals[3];

        animals[0] = new Cat("Kurre");
        animals[1] = new Dog("Vilma");
        animals[2] = new Cat("Bamse");

        i = 0;
        while (i < animals.length) {
            animals[i].introduceYourself();
            i = i + 1;
        }*/
        Animals kurre = new Cat("Kurre");
        Animals vilma = new Dog("Vilma");

        kurre.age = 6;
        vilma.age = 3;

        kurre.introduceYourself();
        vilma.introduceYourself();
    }

}
