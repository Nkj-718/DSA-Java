package users;

import java.util.Scanner;
import quizService.QuizService;

public class Admin extends User{

    public Admin(QuizService quiz, String userName){
        super(quiz, userName);
    }

    @Override 
    public void showMenu(Scanner sc){
        int choice;
        while(true){

                System.out.println("What Action do you want to perform?");
                System.out.println("1. Make a Question.     2. Edit a Question     3. Go Back");
                System.out.print("Action: ");
                choice=sc.nextInt();

                switch(choice){
                    case 1: 
                        quiz.addQuestion(sc);
                        break;
                    case 2:
                        quiz.editQuestion(sc);
                        break;
                    case 3:
                        System.out.println("Returning back to User Menu...");
                        return;
                    default:
                        System.out.println("Invalid Action! Please try again.");
                }
        
        }
    }

}
