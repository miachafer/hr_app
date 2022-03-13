package hrapp;

public class Employee {

    private int id = 0;
    private String name = null;
    private double salary = 0.0;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "Employee ID: " + this.getId() + "\n"
                + "Employee Name: " + this.getName() + "\n"
                + "Employee Salary " + this.getSalary();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
