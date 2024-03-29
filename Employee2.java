import java.security.PrivateKey;
import java.util.PrimitiveIterator;

public class Employee2 {

    private String name;
    private long id;
    private int salary;


    public Employee2(String name, long id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void updateSalary(int newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
            System.out.println("Salary updated successfully for employee " + name);
        } else {
            System.out.println("Invalid salary. Salary cannot be negative.");
        }

    }


    public static void main(String[] a) {

        Employee2 E = new Employee2("SUDHIR", 52, 50000);

        System.out.println(E.getName());
        System.out.println(E.getId());
        System.out.println(E.getSalary());

        E.updateSalary(200);
        System.out.println(E.getSalary());
    }


}













