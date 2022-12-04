package lesson7;

public class Lesson7 {
    public static void main(String[] args) {
    Cat cat = new Cat("Bars");
    Animal animal = new Cat("Murka");
    animal.greeds();
    Pet pet = new Cat("Banny");
    pet.walk();
    Bigdog bigDog= new Bigdog("Sharik");
    bigDog.greeds(new Bigdog("Silva"));
    testMethod(bigDog);
    }
    public static void testMethod(Pet pet){
        pet.feed();
    }
}
