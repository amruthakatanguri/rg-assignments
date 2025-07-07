package Assignment;

class Employeedemo {
    private int id;
    private String name;
    private String department;

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
public class Encapsulationdemo {
    public static void main(String[] args) {
        Employeedemo emp = new Employeedemo();

        emp.setId(101);
        emp.setName("Amrutha");
        emp.setDepartment("CSE");

        System.out.println("Employee Details:");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
    }
}
