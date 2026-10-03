package users;

import java.util.Scanner;
import questions.Question;

public class Player extends User{
    private int playerScore;

    public Player(String userName){
        super(userName);
        playerScore=0;
    }

    public int getPlayerScore(){
        return playerScore;
    }

    public void playQuiz(Question[] questions, Scanner sc){
        int i=0;
        for(Question question : questions){
            System.out.println("Question " + (++i) + ": " + question.getQuestion());
            System.out.println("A. " + question.getOption1() + "    B. " + question.getOption2());
            System.out.println("C. " + question.getOption3() + "    D. " + question.getOption4());
            System.out.print("Answer: ");
            String userAnswer=sc.nextLine();
            if( checkAnswer(userAnswer, question.getCorrectOption()) )
                playerScore+=4;
            else
                playerScore-=1;
        }
    }

    @Override 
    public void showMenu(Scanner sc){
        int choice;
        while(true){

            do{
                System.out.println("What Action do you want to perform?");
                System.out.println("1. Play Quiz.     2. Check Score     3. Go Back");
                System.out.print("Action: ");
                choice=sc.nextInt();

                switch(choice){
                    case 1: 
                        playQuiz(sc);
                        break;
                    case 2:
                        System.out.println("Your [" + getUserName() + "] Score is: " + getPlayerScore());;
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

    private boolean checkAnswer(String userAnswer, String correctAnswer){
        return (userAnswer.toLowerCase()).equals(correctAnswer.toLowerCase());
    }
    

}
