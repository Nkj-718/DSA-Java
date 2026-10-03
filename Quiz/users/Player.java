package users;

import java.util.Scanner;
import quizService.QuizService;

public class Player extends User{
    private int playerScore;

    public Player(QuizService quiz, String userName){
        super(quiz, userName);
        playerScore=0;
    }

    public void updatePlayerScore(int points, String pointType){
        if("Reward".equals(pointType)){
            playerScore+=points;
        }
        else if("Penalty".equals(pointType)){
            playerScore-=points;
        }
    }

    public int getPlayerScore(){
        return playerScore;
    }

    @Override 
    public void showMenu(Scanner sc){
        int choice;
        while(true){

                System.out.println("\nWhat Action do you want to perform?");
                System.out.println("1. Play Quiz.     2. Check Score     3. Go Back");
                System.out.print("Action: ");
                choice=sc.nextInt();

                switch(choice){
                    case 1: 
                        quiz.playQuiz(this, sc);
                        break;
                    case 2:
                        System.out.println("Your [" + getUserName() + "] Score is: " + getPlayerScore());
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
