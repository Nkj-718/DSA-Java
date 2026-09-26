package employeehierarchy;

class Director extends Manager{
    private String department;

    Director(String name, int salary, int teamSize, String department){
        super(name, salary, teamSize);
        this.department=department;
    }

    @Override 
    void setRole(){
        role="Director";
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println(getName() + " is the director of " + department + " department");
    }

    @Override 
    void work(){
        System.out.println("Director is working...");
    }

}
