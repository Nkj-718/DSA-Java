import users.*;
import java.util.Scanner;

import quizService.QuizService;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        QuizService quiz=new QuizService();

        System.out.print("Enter your UserName: ");
        String userName=sc.nextLine();

        int choice;

        do{
            System.out.println("==========================================================");
            System.out.println("Choose your user Role");
            System.out.println("1. Admin (Make Questions)    2. Player (Answer Questions)    3. Exit (Terminate Session)");
            System.out.print("Choice: ");
            choice=sc.nextInt();
            
            User user;
            switch(choice){
                case 1:
                    user=new Admin(quiz, userName);
                    user.showMenu(sc);
                    break;
                case 2:
                    user=new Player(quiz, userName);
                    user.showMenu(sc);
                    break;
                case 3: 
                    System.out.println("Session Terminated!");
                    break;
                default:
                    System.out.println("Invalid Input! Please Try Again.");
            }

        }while(choice!=3);
        
        sc.close();
    }
}
