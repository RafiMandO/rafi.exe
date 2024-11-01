import java.util.Scanner;
class employee
{
    String name;
    int age;
    String id;
    double salary;
}
public class learn {
    public static void main (String[] args){
        Scanner gg = new Scanner(System.in);
        employee obj= new employee();

        System.out.println("Enter Your Name: ");
        obj.name = gg.nextLine();

        System.out.println("Enter Your Age : ");
        obj.age = gg.nextInt();

        System.out.println("Enter Your ID : ");
        obj.id = gg.nextLine();

        System.out.println("Enter your Salary : ");
        obj.salary= gg.nextDouble();

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("DATA :");
        System.out.println("Employee name: " + obj.name);
        System.out.println("Employee id: " + obj.id);
        System.out.println("Employee age: " + obj.age);
        System.out.println("Employee Salary: " + obj.salary);
    }
}

