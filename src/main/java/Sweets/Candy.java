package Sweets;

public class Candy extends Sweets{
    private String type;

    public Candy(String title, Double weight, Double price, String type) {
        super(title, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy [" + super.toString() + ", type = " + type + "]";
    }
}
