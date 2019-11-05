package model;

public class Order {
    private double price;
    private String title;

    public Order() {
    }

    public Order(double price, String title) {
        this.price = price;
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", title='" + title + '\'' +
                '}';
    }

}
