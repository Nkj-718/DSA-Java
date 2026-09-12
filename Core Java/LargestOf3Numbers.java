import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter num2: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter num3: ");
        double num3 = sc.nextDouble();

        if(num1>num2 && num1>num3){
            System.out.println("num1 is largest.");
        }
        else if(num2>num3 && num1!=num2){
            System.out.println("num2 is largest.");
        }
        else if(num3>num2 && num3!=num1){
            System.out.println("num3 is largest.");
        }
        else if(num1==num2 && num1==num3){
            System.out.println("All three numbers are equal.");
        }
        else if(num1 == num2){
            System.out.println("num1 and num2 are equal and largest");
        }
        else if(num2==num3){
            System.out.println("num2 and num3 are equal and largest");
        }
        else{
            System.out.println("num1 and num3 are equal and largest");
        }
        
        sc.close();
    }
}
