import java.util.Scanner;

public class BasicCalculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1=sc.nextInt();
        System.out.print("Enter num2: ");
        int num2=sc.nextInt();
        
        System.out.println("Calculator:-");
        System.out.println("Sum: " + (num1+num2));
        System.out.println("Difference: " + (num1-num2));
        System.out.println("Product: " + (num1*num2));
        System.out.println("Quotient: " + (num1/num2));
        System.out.println("Remainder: " + (num1%num2));
        
        sc.close();
    }
}
