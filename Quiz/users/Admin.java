package users;

import java.util.Scanner;

public class Admin extends User{

    public Admin(String userName){
        super(userName);
    }
    
    public void makeQuestion(){}

    public void chooseQuestion(){}

    public void editQuestion(){}

    @Override 
    public void showMenu(Scanner sc){
        int choice;
        while(true){

            do{
                System.out.println("What Action do you want to perform?");
                System.out.println("1. Make a Question.     2. Edit a Question     3. Go Back");
                System.out.print("Action: ");
                choice=sc.nextInt();

                switch(choice){
                    case 1: 
                        makeQuestion();
                        break;
                    case 2:
                        editQuestion();
                        break;
                    case 3:
                        System.out.println("Returning back to User Menu...");
                        return;
                    default:
                        System.out.println("Invalid Action! Please try again.");
                }

            }while(choice<1 || choice>3);
        
        }
    }

}
