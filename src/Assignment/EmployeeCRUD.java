package Assignment;
import java.util.*;
public class EmployeeCRUD {
    private static List<Employee> employeeList = new ArrayList<>();

    // Create
    public static void addEmployee(Employee e) {
        employeeList.add(e);
    }

    // Read
    public static void displayEmployees() {
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }

    // Update
    public static void updateEmployee(int id, String newName, String newDept) {
        for (Employee e : employeeList) {
            if (e.getId() == id) {
                e.setName(newName);
                e.setDepartment(newDept);
            }
        }
    }

    // Delete
    public static void deleteEmployee(int id) {
        employeeList.removeIf(e -> e.getId() == id);
    }

    public static void main(String[] args) {
        // Add employees
        addEmployee(new Employee(1, "Amrutha", "CSE"));
        addEmployee(new Employee(2, "Varshini", "ECE"));

        System.out.println("Employees after adding:");
        displayEmployees();

        // Update
        updateEmployee(1, "Amrutha V", "IT");

        // Delete
        deleteEmployee(2);

        System.out.println("Employees after update & delete:");
        displayEmployees();
    }
}
