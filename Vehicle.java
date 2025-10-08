// Parent class
public class Vehicle {
    protected String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public void honk() {
        System.out.println("Honk honk!");
    }
    
    public String getBrand() {
        return brand;
    }
}

// Child class
class SportsCar extends Vehicle {
    private String model;
    
    public SportsCar(String brand, String model) {
        super(brand);
        this.model = model;
    }
    
    @Override
    public void honk() {
        System.out.println("Sports car honk: Beep beep!");
    }
    
    public String getModel() {
        return model;
    }
    
    public String getFullName() {
        return brand + " " + model;
    }
}
