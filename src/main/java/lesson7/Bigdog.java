package lesson7;

public class Bigdog extends Dog{
    public Bigdog(String name) {
        super(name);
    }

    @Override
    void greeds() {
        System.out.println("Woof");
    }

    @Override
    void greeds(Dog dog) {
        System.out.println("Woooooooof");
    }

    void greeds (Bigdog bigdog){
        System.out.println("Woooooooooooooooooooooof");

    }
}
