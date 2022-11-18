package homework5;

public class Homework5 {
    public static void main(String[] args) {
        Cat murka = new Cat(false, "chicken", 4, "purpure");
        Cat barsik = new Cat(true, "pineapple", 4);
        System.out.println("Murka`s food " + "is " + murka.getEats());
        System.out.println("Barsik`s food " + "is " + barsik.getEats());
        System.out.println(barsik.getColour());

    }
}
