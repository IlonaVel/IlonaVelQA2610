package lesson4;

public class Person {
    public static String typeDNK = "HUMAN";
    public String name, family;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamily() {
        return family;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Person(String name, String family, int age) {
            this.name = name;
            this.family = family;
            this.age = validateAge(age);
        }

    private int validateAge(int age) {
        if (age > 16 && age < 105) {
            return age;
        } else {
            age = 16;

            return age;
        }
    }


    public Person(String name, String family) {
        this.name = checkName(name);
        this.family = family;
        this.age = 92;
    }

    private String checkName(String name) {
        return name.toLowerCase();
    }


    public void printPrettyInfo(){
        System.out.println("Name: " + lowerCase(this.name));
        System.out.println("Family: "+ this.family);
        System.out.println("Type "+ typeDNK);
    }

    private String lowerCase(String name){

        return name == null ? "" : name.toUpperCase();
    }
}
