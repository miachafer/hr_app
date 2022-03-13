package hrapp;

import java.util.Arrays;

public class Department {

    private int depId = 0;
    private String depName = null;
    private Employee[] depEmployees = new Employee[10];

    /*
    This variable lastAddedEmployeeIndex is important for adding a new employee 
    method and to return how many employees a department has.
    It's important to start with a count -1 because the index of any array starts
    with 0, even if the array has one position filled. 
     */
    private int lastAddedEmpIndex = -1;

    /*
    A constructor for the Department class:
     */
    public Department(int depId, String depName) {
        this.depId = depId;
        this.depName = depName;
    }

    /*
    Getters and setters:
     */
    public int getDepId() {
        return depId;
    }

    public void setDepId(int id) {
        this.depId = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String name) {
        this.depName = name;
    }

    /*
    ADDING AN EMPLOYEE TO THE DEPARTMENT
    This method of adding an employee to the department uses the lastAddedEmployeeIndex
    variable.     If the index is less than the length of the array of employees 
    (depEmployees) the index correspondent in the depEmployees array will be filled 
    with an employee.
     */
    // Insert try-catch!
    public void addEmployee(Employee e) {
        if (lastAddedEmpIndex + 1 == depEmployees.length) {
            System.out.println("Department overload.");
        } else if(lastAddedEmpIndex < depEmployees.length) {
            lastAddedEmpIndex++;
            depEmployees[lastAddedEmpIndex] = e;
        }
    }

    /*
    Here is a new array with only the current employees.
    So this array will not have any null fields.
     */
    public Employee[] getDepEmployees() {
        Employee[] currentEmployees = new Employee[lastAddedEmpIndex + 1];

        for (int i = 0; i < currentEmployees.length; i++) {
            currentEmployees[i] = depEmployees[i];
        }
        return currentEmployees;
    }

    /*
    Printing the department data overriding the toString method
     */
    @Override
    public String toString() {
        return "Department ID: " + this.getDepId() + "\n"
                + "Department Name: " + this.getDepName() + "\n"
                + "Department Employees:\n" + Arrays.toString(this.getDepEmployees());
    }

    public int getNumberOfEmployees() {
        return lastAddedEmpIndex + 1;
    }

    public Employee getEmpById(int empId) {
        for (Employee employee : depEmployees) {
            if (employee != null) {
                if (employee.getId() == (empId)) {
                    return employee;
                }
            }
        }
        return null;
    }

    public double getTotalSalary() {
        double totalSalary = 0.0;
        for (int i = 0; i < lastAddedEmpIndex + 1; i++) {
            totalSalary += depEmployees[i].getSalary();
        }
        return totalSalary;
    }

    public double getAverageSalary() {
        if (lastAddedEmpIndex > -1) {
            return getTotalSalary() / getNumberOfEmployees();
        }
        return 0.0; // when the department is empty
    }
}
