package employeehierarchy;

class Employee {
    private String name;
    private int employeeId;
    private int salary;
    protected String role;

    Employee(){
        employeeId=(int) (Math.random()*10000000);
    }

    Employee(String name, int salary){
        this();
        this.name=name;
        this.salary=salary;
        setRole();
    }

    void setRole(){
        role = "Employee";
    }

    String getRole(){
        return role;
    }

    String getName(){
        return name;
    }

    int getEmployeeId(){
        return employeeId;
    }

    int getSalary(){
        return salary;
    }

    void displayDetails(){
        System.out.println("ID: " + employeeId + "    Name: " + name + "    Salary: " + salary);
    }
    
    void work(){
        System.out.println("Employee is working...");
    }
}
