package Homework7;

public class Wolf extends Animal1 implements WildAnimal{
    public Wolf(String name) {
        super(name);
    }

    @Override
    void greeds() {
        System.out.println("Wolf "+getName()+ " says Hawoo");

    }

    @Override
    public void hunting() {
        System.out.println("Wolf "+getName()+ " goes hunting");

    }
}
