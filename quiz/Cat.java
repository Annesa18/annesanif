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

    String name;

    Cat(String name) {
        this.name = name;
    }

    public void introduceYourself() {
        System.out.print("\nMeow.I am a cat. My name is" + " " + name + ".");
    }
}
