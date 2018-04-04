package Sweets;

public class Cookies extends Sweets{
    private String quantity;

    public Cookies(String title, Double weight, Double price, String quantity) {
        super(title, weight, price);
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Cookies [" + super.toString() + ", quantity = " + quantity + "]";
    }
}
