package quiz;

public class Cat extends Animals {

    String name;

    Cat(String kurre) {
        name = kurre;
    }

    public void introduceYourself() {
        System.out.print("\nMeow.I am a cat. My name is" + " " + this.name + ".");
        System.out.println("\nand I am " + this.age + " years old.");
    }
}
