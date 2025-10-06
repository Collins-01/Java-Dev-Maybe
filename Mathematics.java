
public class Mathematics {

    public static void main(String[] args) {
        int age = 25;
        System.out.println("Age: " + age);
        int salary = 5000;
        System.out.println("Salary: " + salary);
        System.out.println("Age + Salary: " + (age + salary));
        System.out.println("Age - Salary: " + (age - salary));
        System.out.println("Age * Salary: " + (age * salary));
        System.out.println("Age / Salary: " + (age / salary));
        System.out.println("Age % Salary: " + (age % salary));
       int result= Math.min(age, salary);
       System.out.println("Minimum: " + result);
    }
}