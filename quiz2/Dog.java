package quiz;

public class Dog extends Animals {

   
    String name;

    Dog(String vilma) {
        name = vilma;
    }

    public void introduceYourself() {
        System.out.print("\nWoof.I am a dog. My name is" + " " + this.name + ".");
        System.out.println("\nand I am " + this.age + " years old.");
    }
}
