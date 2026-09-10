import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int name=sc.nextInt();
        System.out.println("Name: " + name);
    
        sc.close();
    }    
}
