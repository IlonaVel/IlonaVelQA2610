package Homework7;

public class Lion extends Animal1 implements WildAnimal{
    public Lion(String name) {
        super(name);
    }

    @Override
    void greeds() {
        System.out.println("Lion "+getName()+" says Roar");

    }

    @Override
    public void hunting() {
        System.out.println("Lion "+getName()+" goes hunting");

    }
}
