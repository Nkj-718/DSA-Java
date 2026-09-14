class employeeDetails{
    private int id;
    private String name;
    private int baseSalary;
    private int bonus;

    public employeeDetails(int id, String name, int baseSalary, int bonus){
        this.id=id;
        this.name=name;
        this.baseSalary=baseSalary;
        this.bonus=calculateBonus(bonus);
    }

    public employeeDetails(int id, String name, int baseSalary, double bonus){
        this.id=id;
        this.name=name;
        this.baseSalary=baseSalary;
        this.bonus=(int)Math.round(calculateBonus(bonus));
    }

    public int calculateAnnualSalary(){
        return (baseSalary*12)+bonus;
    }

    public int calculateSalaryWithBonus(){
        return baseSalary+bonus;
    }

    public int calculateBonus(int bonus){ //did this to practice Method Overloading.
        return bonus;
    }

    public double calculateBonus(double bonus){
        return (((double)baseSalary)/100)*bonus;
    }

    public void showDetails(){
        System.out.println("Empoyee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Salary with Bonus: " + calculateSalaryWithBonus());
        System.out.println("Annual Salary: " + calculateAnnualSalary());
        System.out.println("Bonus Amount: " + bonus);
        System.out.println();
    }
}

public class Employee {
    public static void main(String[] args) {
        employeeDetails e1 = new employeeDetails(101, "Aakash", 45001, 5.5);
        employeeDetails e2 = new employeeDetails(178, "John", 72300, 9500);
        employeeDetails e3 = new employeeDetails(124, "Farhan", 54000, 5000);

        e1.showDetails();
        e2.showDetails();
        e3.showDetails();
    }   
}
