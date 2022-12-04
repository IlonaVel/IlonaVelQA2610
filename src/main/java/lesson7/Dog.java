package lesson7;

public class Dog extends Animal implements Pet{

    public Dog(String name) {
        super(name);
    }

    @Override
    void greeds() {
        System.out.println("Dog "+getName()+" Says woof");
    }
    void greeds(Dog dog){
        System.out.println("Woooof");
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + getName());

    }

    @Override
    public void play() {
        System.out.println("Dog " + getName()+" playing");

    }

    @Override
    public void walk() {
        System.out.println("Dog " + getName()+" walking");

    }
}
