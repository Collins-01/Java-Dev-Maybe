public class Main {
    public static void main(String[] args) {
        // Demonstrate Car class
        System.out.println("=== Car Class Demo ===");
        Car myCar = new Car("Red", 200, "Ferrari");
        myCar.drive();
        System.out.println("Current color: " + myCar.getColor());
        myCar.setColor("Blue");
        System.out.println("New color: " + myCar.getColor());
        
        // Demonstrate Vehicle and SportsCar (inheritance)
        System.out.println("\n=== Inheritance Demo ===");
        SportsCar sportsCar = new SportsCar("Porsche", "911");
        System.out.println("Vehicle brand: " + sportsCar.getBrand());
        System.out.println("Car model: " + sportsCar.getModel());
        System.out.println("Full name: " + sportsCar.getFullName());
        sportsCar.honk();
        
        // Demonstrate polymorphism
        System.out.println("\n=== Polymorphism Demo ===");
        Vehicle vehicle = new SportsCar("Lamborghini", "Aventador");
        vehicle.honk(); // Calls SportsCar's honk() method at runtime
        
        // Demonstrate Counter class with static members
        System.out.println("\n=== Static Members Demo ===");
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println("Number of Counter instances: " + Counter.getCount());
    }
}

// Counter class to demonstrate static members
class Counter {
    private static int count = 0;  // Static variable
    
    public Counter() {
        count++;  // Increment count each time a new object is created
    }
    
    public static int getCount() {  // Static method
        return count;
    }
}
