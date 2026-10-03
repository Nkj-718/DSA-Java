package users;

import java.util.Scanner;

abstract public class User {
    protected String userName;
    
    public User(String userName){
        this.userName=userName;
    }

    public String getUserName(){
        return userName;
    }

    abstract public void showMenu(Scanner sc);

}
