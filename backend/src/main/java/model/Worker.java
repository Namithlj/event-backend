package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "workers")
public class Worker {
    @Id
    private String id;

    private String name;
    private String phone;
    private String email;
    private String location;   // pincode or address
    private String serviceType; // "Hotel", "Photography", "Catering", "Decoration", "FunctionHall"
    private String experience;  // e.g., "5 years"
    private double price;
    private String priceBasis;  // e.g., "per day", "per event"

    public Worker() {}

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public String getServiceType() { return serviceType; }
    public void setServiceType(String serviceType) { this.serviceType = serviceType; }

    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getPriceBasis() { return priceBasis; }
    public void setPriceBasis(String priceBasis) { this.priceBasis = priceBasis; }
}
