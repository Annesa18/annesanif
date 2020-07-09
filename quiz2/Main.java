package quiz;

c class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here

        Animals kurre = new Cat("Kurre");
        Animals vilma = new Dog("Vilma");

        kurre.age = 6;
        vilma.age = 3;

        kurre.introduceYourself();
        vilma.introduceYourself();
    }

}
