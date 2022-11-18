package lesson4;

public class lesson4 {
    public static void main(String[] args) {
        User user = new User("Ilonochka", 1983);
        System.out.println(user.age);


        Person person = new Person("Ilona", "Velizhanina");
        Person person2 = new Person("Alex", "Willy");
        Person.typeDNK = "MARS";
        System.out.println(person.getName());

    }
}







