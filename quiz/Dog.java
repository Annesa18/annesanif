package quiz;

public class Dog extends Animals {

    String name;

    Dog(String name) {
        this.name = name;
    }

    public void introduceYourself() {
        System.out.print("\nWoof.I am a dog. My name is" + " " + name + ".");
    }
}
