/**
 * TypeCasting.java
 * 
 * This class demonstrates type casting in Java, which is the process of converting
 * a value from one data type to another.
 * There are two types of type casting in Java:
 * 1. Widening Casting (Implicit) - converting a smaller type to a larger type size
 * 2. Narrowing Casting (Explicit) - converting a larger type to a smaller size type
 */

public class TypeCasting {
    public static void main(String[] args) {
        // 1. Primitive Type Casting
        System.out.println("=== Primitive Type Casting ===");
        
        // Widening Casting (Implicit - done automatically)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println("Widening Casting (int to double): " + myInt + " → " + myDouble);

        // Narrowing Casting (Explicit - must be done manually)
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble; // Manual casting: double to int
        System.out.println("Narrowing Casting (double to int): " + anotherDouble + " → " + anotherInt);

        // 2. Type Conversion Between Different Primitive Types
        System.out.println("\n=== Type Conversion Between Primitives ===");
        
        // int to String
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println("int to String: " + num + " → \"" + numStr + "\"");
        
        // String to int
        String numStr2 = "200";
        int num2 = Integer.parseInt(numStr2);
        System.out.println("String to int: \"" + numStr2 + "\" → " + num2);
        
        // 3. Object Type Casting
        System.out.println("\n=== Object Type Casting ===");
        
        // Upcasting (Implicit) - Child to Parent
        Parent parent = new Child(); // Implicit upcasting
        parent.show();
        
        // Downcasting (Explicit) - Parent to Child
        if (parent instanceof Child) {
            Child child = (Child) parent; // Explicit downcasting
            child.display();
        }
    }
}

// Parent class
class Parent {
    void show() {
        System.out.println("This is Parent class show method");
    }
}

// Child class extending Parent
class Child extends Parent {
    @Override
    void show() {
        System.out.println("This is Child class show method (overridden)");
    }
    
    void display() {
        System.out.println("This is Child class display method");
    }
}