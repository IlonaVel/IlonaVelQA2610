package homework5;

public class Cat extends Animals{
    private String colour;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs, String colour) {
        super(vegetarian, eats, noOfLegs);
        this.colour = colour;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.colour = "orange";
    }
}
