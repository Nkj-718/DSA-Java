import questions.Question;
import users.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Question[] questions=new Question[5];

        questions[0]=new Question("Size of Int", new String[]{"1 byte", "2 bytes", "4 bytes", "8 bytes"}, "4 bytes");
        questions[1]=new Question("Size of Double", new String[]{"12 byte", "2 bytes", "4 bytes", "8 bytes"}, "8 bytes");
        questions[2]=new Question("Size of Char", new String[]{"1 byte", "2 bytes", "4 bytes", "8 bytes"}, "2 bytes");
        questions[3]=new Question("Size of Float", new String[]{"1 byte", "2 bytes", "4 bytes", "8 bytes"}, "4 bytes");
        questions[4]=new Question("Size of Boolean", new String[]{"1 bit", "1 byte", "2 bytes", "4 bytes"}, "1 byte");

        System.out.println("What is your user role?");
        System.out.println("1. Admin (Make Questions)    2. Player (Answer Questions)    3. Exit (Terminate Session)");
        System.out.print("Role: ");
        int role=sc.nextInt();
        switch(role){
            case 1:
                Admin admin = new Admin();
                admin.showMenu();
                break;
            
            case 2:
                System.out.println("Enter Name: ");
                String playerName=sc.nextLine();
                Player player = new Player();
                player.startQuiz(playerName), questions;
                break;
            
            case 3:
                break;
            default:
        }

        sc.close();
    }
}
