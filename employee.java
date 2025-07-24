// Define the Employee class
public class Employee {
    // Fields (attributes)
    String name;
    int id;
    double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to increase salary
    public void increaseSalary(double amount) {
        salary += amount;
        System.out.println("Salary increased by " + amount);
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: $" + salary);
    }

    // Main method
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp1 = new Employee("Ravi Kumar", 1001, 35000.0);

        // Display initial details
        emp1.displayDetails();

        // Increase salary
        emp1.increaseSalary(5000.0);

        // Display updated details
        System.out.println("\nUpdated Employee Details:");
        emp1.displayDetails();
    }
}
