import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter password: ");
        String password=sc.next();
        boolean isValid=false;

        if(password.length()>=8 && !password.equals("password") && !password.isBlank())
            isValid=true;

        if(isValid)
            System.out.println("Password is valid");
        else
            System.out.println("Password is invalid");

        sc.close();
    }    
}
