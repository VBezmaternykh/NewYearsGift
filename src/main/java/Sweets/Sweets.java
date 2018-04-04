package Sweets;

public abstract class Sweets {
    private String title;
    private Double weight;
    private Double price;

    Sweets(String title, Double weight, Double price) {
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "title = " + title + ", weight = " + weight + ", price = " + price;
    }
}
