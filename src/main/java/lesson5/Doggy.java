package lesson5;

public class Doggy extends Animal{
    private boolean pet;
    private String colour;

    public Doggy(String name, int age, String colour, boolean pet) {
        super(name, age);
        this.pet = pet;
        this.colour = colour;
    }

    public Doggy(String name, int age, String colour) {
        super(name, age);
        this.colour = colour;
        this.pet = true;
    }
}


