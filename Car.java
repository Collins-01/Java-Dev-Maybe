public class Car {
    // Fields (attributes)
    private String color;
    private int maxSpeed;
    private String model;
    
    // Constructor
    public Car(String color, int maxSpeed, String model) {
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    
    // Method to simulate driving
    public void drive() {
        System.out.println("The " + color + " " + model + " is driving at " + maxSpeed + " km/h");
    }
    
    // Getter methods
    public String getColor() {
        return color;
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public String getModel() {
        return model;
    }
    
    // Setter methods
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
}
