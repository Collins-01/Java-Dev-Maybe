public class DataTypes {
    public static void main(String[] args) {
        // byte: 8-bit signed integer (-128 to 127) - used for small numbers to save memory
        byte age = 25;
        // short: 16-bit signed integer (-32,768 to 32,767) - used for medium-sized numbers
        short year = 2025;
        // int: 32-bit signed integer (-2^31 to 2^31-1) - default choice for whole numbers
        int population = 210000000;
        // long: 64-bit signed integer (-2^63 to 2^63-1) - used for very large numbers
        long stars = 9876543210L;

        // float: 32-bit floating point number - used for decimal numbers with single precision
        float temperature = 36.6f;
        // double: 64-bit floating point number - default for decimal numbers, more precise than float
        double price = 999.99;

        // char: 16-bit Unicode character - stores a single character
        char grade = 'A';
        // boolean: true or false - used for logical conditions
        boolean isJavaFun = true;

        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("Stars: " + stars);
        System.out.println("Temperature: " + temperature);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Is Java Fun? " + isJavaFun);
    }
}
