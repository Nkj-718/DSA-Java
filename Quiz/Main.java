import users.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your UserName: ");
        String userName=sc.nextLine();

        int role;
        do{

            do{
                System.out.println("What is your user role?");
                System.out.println("1. Admin (Make Questions)    2. Player (Answer Questions)    3. Exit (Terminate Session)");
                System.out.print("Role: ");
                role=sc.nextInt();

                User user;
                switch(role){
                    case 1:
                        user=new Admin(userName);
                        user.showMenu(sc);
                        break;
                    case 2:
                        user=new Player(userName);
                        user.showMenu(sc);
                        break;
                    case 3: 
                        System.out.println("Session Terminated!");
                        break;
                    default:
                        System.out.println("Invalid Input! Please Try Again.");
                }

            }while(role<1 || role>3);

        }while(role!=3);
        
        sc.close();
    }
}
