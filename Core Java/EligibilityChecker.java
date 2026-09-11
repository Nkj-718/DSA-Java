import java.util.Scanner;

public class EligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Age: ");
        byte age = sc.nextByte();
        System.out.print("Do you have an id?(true/false): ");
        boolean hasId = sc.nextBoolean();
        
        if(age>=21 && hasId){
            System.out.println("Eligible.");
        }
        else{
            System.out.println("Not Eligible.");
        }
        sc.close();
    }    
}
