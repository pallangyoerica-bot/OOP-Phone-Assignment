abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public abstract void work();
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " manages workers and supervises the business.");
    }
}

class Cashier extends Employee {
    public Cashier(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " receives payments and serves customers.");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Bupe", 800000);
        Cashier cashier = new Cashier("Erica", 400000);

        manager.work();
       System.out.println("Manager Name: " + manager.getName());
       System.out.println("Salary: " + manager.getSalary());

        cashier.work();
        System.out.println("Cashier Name: " + cashier.getName());
        System.out.println("Salary: " + cashier.getSalary());
    }
}
