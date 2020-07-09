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
public class Cat extends Animals {

    /*String name;
    int age;

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }*/
    String name;

    Cat(String kurre) {
        name = kurre;
    }

    public void introduceYourself() {
        System.out.print("\nMeow.I am a cat. My name is" + " " + this.name + ".");
        System.out.println("\nand I am " + this.age + " years old.");
    }
}
