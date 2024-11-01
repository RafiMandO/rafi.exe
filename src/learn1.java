import java.util.Scanner;

class Employee {
    String name;
    int age;
    String id;
    double salary;
}

public class Learn1 {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        Employee obj = new Employee();

        System.out.println("Enter Your Name: ");
        obj.name = gg.nextLine();

        System.out.println("Enter Your Age : ");
        obj.age = gg.nextInt();
        gg.nextLine();  // Clear the newline left by nextInt()

        System.out.println("Enter Your ID : ");
        obj.id = gg.nextLine();

        System.out.println("Enter your Salary : ");
        obj.salary = gg.nextDouble();

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("DATA :");
        System.out.println("Employee name: " + obj.name);
        System.out.println("Employee id: " + obj.id);
        System.out.println("Employee age: " + obj.age);
        System.out.println("Employee Salary: " + obj.salary);

        gg.close();  // Close the Scanner
    }
}
