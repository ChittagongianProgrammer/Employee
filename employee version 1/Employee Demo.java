public class EmployeeRunner {
    public static void main(String[] args) {
        // Create instances of the Employee class
        Employee employee1 = new Employee("John Doe", 30);
        Employee employee2 = new Employee("Jane Smith", 35);

        // Access and modify the employee objects
        System.out.println("Employee 1: " + employee1.getName() + ", Age: " + employee1.getAge());
        System.out.println("Employee 2: " + employee2.getName() + ", Age: " + employee2.getAge());

        employee1.setName("John Smith");
        employee2.promote();

        System.out.println("\nAfter changes:");
        System.out.println("Employee 1: " + employee1.getName() + ", Age: " + employee1.getAge());
        System.out.println("Employee 2: " + employee2.getName() + ", Age: " + employee2.getAge() + ", Payscale: " + employee2.getPayscale());
    }
}
