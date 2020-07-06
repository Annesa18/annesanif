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

    String name;

    Dog(String name) {
        this.name = name;
    }

    public void introduceYourself() {
        System.out.print("\nWoof.I am a dog. My name is" + " " + name + ".");
    }
}
