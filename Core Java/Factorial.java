import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long factorial=1l;
        int i=1;

        if(num<0)
            System.out.println("Invalid Number!");
        else{
            while(i<=num){
                factorial=factorial*(i++);
            }
            System.out.println("Factorial of " + num + ": " + factorial);
        }
        
        sc.close();
    }   
}
