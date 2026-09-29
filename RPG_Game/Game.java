import attacks.*;
import characters.player.*;
import characters.enemies.*;
import story.*;
import fights.*;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        System.out.print("Enter your name: ");
        String playerName=sc.next();
        
        System.out.println("Select your Character Class: ");
        System.out.println("1. Rogue");
        System.out.println("2. Barbarian");
        System.out.println("3. Duelist");
        System.out.println("4. Swordsman");
        int classSelect=sc.nextInt();
        Player player=new Player();
        switch(classSelect){
            case 1:
                player=(Rogue)new Rogue();
                break;
            case 2:
                player=(Barbarian)new Barbarian();
                break;
            case 3:
                player=(Duelist)new Duelist();
                break;
            case 4:
                player=(Swordsman)new Swordsman();
                break;
        }
        
        boolean gameCompleted=false;

        Story[] chapters=new Story[9];
        chapters[0]=new Chapter1();
        chapters[1]=new Chapter2();
        chapters[3]=new Chapter3();
        chapters[4]=new Chapter4();
        chapters[5]=new Chapter5();
        chapters[6]=new Chapter6();
        chapters[7]=new Chapter7();
        chapters[8]=new Chapter8();
        chapters[9]=new Chapter9();
        
        Fight[] fights=new Fight[8];
        fights[0]=new Fight1();
        fights[1]=new Fight2();
        fights[3]=new Fight3();
        fights[4]=new Fight4();
        fights[5]=new Fight5();
        fights[6]=new Fight6();
        fights[7]=new Fight7();
        fights[8]=new Fight8();

        for(int i=0; i<chapters.length; i++){
                chapters[i].startStory();
                fights[i].startFight(player);
        }

        while(!gameCompleted){
            RandomFight[] randomFights=new RandomFight[3];
            RepeatingStory chapter=new RepeatingStory();
            chapter.startStory();
            for(RandomFight i : randomFights){
                i.startFight(player);
            }
            fights[7].startFight(player);
            fights[8].startFight(player);
        }

        sc.close();
    }
}
