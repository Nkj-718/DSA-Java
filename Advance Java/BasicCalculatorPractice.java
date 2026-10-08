import java.util.Scanner;

class Calculator{
    
    class Operation{
        public double addition(double num1, double num2){
            return num1+num2;
        }

        public double subtraction(double num1, double num2){
            return num1-num2;
        }
    }
}

public class BasicCalculatorPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.print("Enter first number: ");
        double num1=sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2=sc.nextDouble();

        Calculator calc=new Calculator();
        Calculator.Operation calcOperation=calc.new Operation();

        System.out.println("Results:-");
        System.out.println("Addition: " + calcOperation.addition(num1, num2) + "     Subtraction: " + calcOperation.subtraction(num1, num2));

        sc.close();
    }
}
