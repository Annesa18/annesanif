package quiz;

public class Cat extends Animals {

    String name;

    Cat(String name) {
        this.name = name;
    }

    public void introduceYourself() {
        System.out.print("\nMeow.I am a cat. My name is" + " " + name + ".");
    }
}
