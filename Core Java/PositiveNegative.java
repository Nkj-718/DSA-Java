import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num=sc.nextDouble(); 
        if(num==0){
            System.out.println("ZERO!");
        }
        else if(num>0){
            System.out.println("POSITIVE!");
        }
        else{
            System.out.println("NEGATIVE!");
        }
        sc.close();
    }    
}
