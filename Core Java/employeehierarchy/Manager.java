package employeehierarchy;

class Manager extends Employee{
    private int teamSize;
    Manager(String name, int salary, int teamSize){
        super(name, salary);
        this.teamSize=teamSize;
    }

    int getTeamSize(){
        return teamSize;
    }

    @Override 
    void setRole(){
        role="Manager";
    }

    @Override 
    void displayDetails(){
        super.displayDetails();
        System.out.println(getName() + " is managing a team of " + teamSize + " members.");
    }

    @Override
    void work(){
        System.out.println("Manager is working...");
    }
}
