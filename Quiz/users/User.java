package users;

import java.util.Scanner;

import quizService.QuizService;

abstract public class User {
    protected String userName;
    protected QuizService quiz;
    
    public User(QuizService quiz, String userName){
        this.userName=userName;
        this.quiz=quiz;
    }

    public String getUserName(){
        return userName;
    }

    public abstract void showMenu(Scanner sc);

}
