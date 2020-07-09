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
public class Dog extends Animals {

    /*String name;
    int age;

    Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }*/
    String name;

    Dog(String vilma) {
        name = vilma;
    }

    public void introduceYourself() {
        System.out.print("\nWoof.I am a dog. My name is" + " " + this.name + ".");
        System.out.println("\nand I am " + this.age + " years old.");
    }
}
