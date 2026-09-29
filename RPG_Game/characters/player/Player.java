package characters.player;

import java.util.Scanner;
import attacks.Attack;
import characters.GameCharacter;

public class Player extends GameCharacter{
    protected String weapon;
    protected String attackEffect;
    protected double boost;
    protected Attack[] attacks=new Attack[4];
    private int distance;

    public Player(){
        position=0;
        boost=1;
        isShielded=false;
    }

    public void setShield(boolean isShielded){
        this.isShielded=isShielded;
    }

    public boolean getShieldStatus(){
        return isShielded;
    }

    void resetBoost(){
        boost=1;
    }

    void setBoost(){
        boost*=1.5;
    }

    @Override 
    void setPosition(int distance){
        position-=distance;
    }

    void assignAttacks(){}

    void attackMenu(Scanner sc){
        System.out.println("1. Light Attack: " + attacks[0].getAttackName());
        System.out.println("2. Heavy Attack: " + attacks[1].getAttackName());
        System.out.println("3. Cast Spell: : " + attacks[2].getAttackName());
        System.out.println("4. Ultimate Attack: " + attacks[3].getAttackName());
        System.out.print("Choose Attack: ");
        int attack=sc.nextInt();
        attacks[attack-1].performAttack(this, target);
    }

    public void setHealth(double damage){
        health-=damage;
    }

    public double getHealth(){
        return health;
    }

    public void chooseAction(Scanner sc){
        System.out.println("1. Attack");
        System.out.println("2. Block");
        System.out.println("3. Move Away");
        System.out.println("4. Move Closer");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                attackMenu(sc);
                break;
            case 2:
                if(Math.random()<80)
                    setShield(true);
                else
                    System.out.println("Block Attempt Failed!");
                break;
            case 3:
                System.out.print("How much distance to cover(1m = 1 AP): ");
                distance=sc.nextInt();
                setPosition(distance);
                break;
            case 4:
                System.out.print("How much distance to cover(1m = 1 AP): ");
                distance=sc.nextInt();
                setPosition(-distance);
                break;
            default:
                System.out.println("Invalid! Choose Again.");
                chooseAction(sc);
        }
    }

    void increaseStat(int stat){
        switch(stat){
            case 1:
                health+=10;
                break;
            case 2:
                strength+=10;
                break;
            case 3:
                speed+=10;
                break;
            case 4:
                mana+=5;
                break;
            case 5:
                endurance+=10;
                break;
        }
    }

}
