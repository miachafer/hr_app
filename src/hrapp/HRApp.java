package hrapp;

public class HRApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Human Resources App!");

        /*
        Creating new employees
         */
        Employee employee01 = new Employee(1, "Joe", 36000.00);
        Employee employee02 = new Employee(2, "Ana", 48000.00);
        Employee employee03 = new Employee(3, "Kim", 42000.00);
        Employee employee04 = new Employee(4, "Bob", 32000.00);
        Employee employee05 = new Employee(5, "Jim", 38000.00);
        Employee employee06 = new Employee(6, "Pam", 52000.00);
        Employee employee07 = new Employee(7, "Roy", 35000.00);
        Employee employee08 = new Employee(8, "Ian", 25000.00);
        Employee employee09 = new Employee(9, "Ray", 78000.00);
        Employee employee10 = new Employee(10, "Meg", 65000.00);
        Employee employee11 = new Employee(11, "Sam", 30000.00);
        Employee employee12 = new Employee(12, "Max", 55000.00);

        /*
        Printing employee data
         */
        System.out.println(employee01);

        /*
        Creating a new department
         */
        Department dep01 = new Department(1, "Accounting");

        dep01.addEmployee(employee01);
        dep01.addEmployee(employee02);
        dep01.addEmployee(employee03);
        

        System.out.println(dep01);

        System.out.println(dep01.getNumberOfEmployees());

        /*
        Searching for an employee by ID
         */
        System.out.println(dep01.getEmpById(50)); 
        
        System.out.println(dep01.getTotalSalary());
        
        System.out.println(dep01.getAverageSalary());
        
        Department dep02 = new Department(2, "Sales");
        
        
        
        System.out.println(dep02.getTotalSalary());
        
        

    }

}
