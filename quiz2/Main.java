package quiz;

public class Main {

    public static void main(String[] args) {

        Animals kurre = new Cat("Kurre");
        Animals vilma = new Dog("Vilma");

        kurre.age = 6;
        vilma.age = 3;

        kurre.introduceYourself();
        vilma.introduceYourself();
    }

}
