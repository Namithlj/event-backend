package model;

public class ServiceDetails {
    private String name;
    private double price;
    private String priceBasis;  // new

    public ServiceDetails() {}

    public ServiceDetails(String name, double price, String priceBasis) {
        this.name = name;
        this.price = price;
        this.priceBasis = priceBasis;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getPriceBasis() {
        return priceBasis;
    }
    public void setPriceBasis(String priceBasis) {
        this.priceBasis = priceBasis;
    }
}
