package employeehierarchy;

class Main {
    public static void main(String[] args) {
        Employee[] employees=new Employee[3];

        employees[0]=new Employee("Akaash", 50000);
        employees[1]=new Manager("Gaurav", 80000, 5);
        employees[2]=new Director("Suresh", 100000, 20, "IT");

        System.out.println("Employee Details:-");
        
        for(Employee employee : employees){
            System.out.println();
            System.out.println("Employee Role: " + employee.getRole());
            employee.displayDetails();
            employee.work();
        }

    }
}
