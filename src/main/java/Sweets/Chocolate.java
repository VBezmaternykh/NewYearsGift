package Sweets;

public class Chocolate extends Sweets{
    private String producer;

    public Chocolate(String title, Double weight, Double price, String producer) {
        super(title, weight, price);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Chocolate [" + super.toString() + ", producer = " + producer + "]";
    }
}
