import java.util.Scanner;

class Employee{
    private int employeeId;
    private String employeeName;
    private int employeeSalary;
    private String department;
    private static int employeeCount=0;
    private static String companyName="TechCorp";
    private static Employee[] employeeList = new Employee[100];

    public Employee(String employeeName, int employeeSalary, String department){
        employeeId=(int)(Math.random()*100000);
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;
        this.department=department;
        employeeCount++;
    }

    public static void showCompanyInfo(){
        System.out.println("Company Name: " + companyName);
        System.out.println("Total number of employees: " + employeeCount);
    }

    public static void addEmployeeRecord(Employee employee){
        employeeList[employeeCount-1]=employee;
    }

    public static void showAllEmployees(){
        if(employeeCount==0){
            System.out.println("No Employee Yet.");
            return;
        }
        for(int i=0; i<employeeCount; i++){
            System.out.println("Employee " + (i+1) + ":-");
            showEmployeeInfo(employeeList[i]);
            System.out.println();
        }
    }

    public static void showEmployeeInfo(Employee employee){
        System.out.println("ID: " + employee.employeeId);
        System.out.println("Name: " + employee.employeeName);
        System.out.println("Salary: " + employee.employeeSalary);
        System.out.println("Department: " + employee.department);
    }

    public void setEmployeeSalary(int salary){
        employeeSalary=salary;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public static Employee getEmployee(int chosenEmployee){
        return employeeList[chosenEmployee];
    }

    public int getEmployeeSalary(){
        return employeeSalary;
    }

    public static int getEmployeeCount(){
        return employeeCount;
    }

    public static void setCompanyName(String companyName){
        Employee.companyName=companyName;
    }

    
}

public class EmployeeRegistry {
    public static void main(String[] args) {
        int choice;

        Scanner sc=new Scanner(System.in);

        do{
            System.out.println("Choose an operation to perform: ");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Change Company Name");
            System.out.println("4. View Company Information");
            System.out.println("5. Change Employee Salary");
            System.out.println("6. Exit");
            System.out.print("Choice: ");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter Name: ");
                    String name=sc.next();
                    System.out.print("Enter Salary: ");
                    int salary=sc.nextInt();
                    System.out.print("Enter Department: ");
                    String department=sc.next();
                    Employee employee=new Employee(name,salary,department);
                    Employee.addEmployeeRecord(employee);
                    break;
                case 2:
                    Employee.showAllEmployees();
                    break;
                case 3:
                    System.out.print("Enter Company Name: ");
                    String companyName=sc.next();
                    Employee.setCompanyName(companyName);
                    break;
                case 4:
                    Employee.showCompanyInfo();
                    break;
                case 5:
                    System.out.println("Employee List:-");
                    Employee.showAllEmployees();
                    System.out.print("Select Employee: ");
                    int chosenEmployee=sc.nextInt();
                    System.out.println("Employee " + Employee.getEmployee(chosenEmployee-1).getEmployeeName() + " selected.");
                    System.out.print("Enter New Salary: ");
                    int changedSalary=sc.nextInt();
                    Employee.getEmployee(chosenEmployee-1).setEmployeeSalary(changedSalary);
                    System.out.println("Employee Name: " + Employee.getEmployee(chosenEmployee-1).getEmployeeName());
                    System.out.println("New Salary: " + Employee.getEmployee(chosenEmployee-1).getEmployeeSalary());
                    break;
                case 6:
                    System.out.println("Session terminated!");
                    break;
                default:
                    System.out.println("Please choose a valid operation to perform.");
            }
        }while(choice!=6);

        sc.close();
    }
}
