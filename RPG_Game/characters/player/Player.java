package characters.player;

import java.util.Scanner;
import attacks.Attack;
import characters.GameCharacter;
import characters.enemies.*;
import fights.*;

public class Player extends GameCharacter{
    protected String weapon;
    protected Attack[] attacks=new Attack[4];
    private int distance;
    private double savedHealth;
    private double savedStrength;
    private double savedSpeed;
    private double savedEndurance;
    private double savedCritChance;
    private int ultimateCharges;

    Scanner sc=new Scanner(System.in);

    public Player(){
        position=0;
        isShielded=false;
        ultimateCharges=0;
    }

    public void penalty(){
        health-=10;
        strength-=10;
        speed-=10;
        endurance-=10;
    }

    boolean isUltimateCharged(){
        return ultimateCharges>=5;
    }

    public void increaseUltimateCharge(){
        ultimateCharges++;
    }

    public void resetUltimateCharges(){
        ultimateCharges=0;
    }

    public void setShield(boolean isShielded){
        this.isShielded=isShielded;
    }

    public boolean getShieldStatus(){
        return isShielded;
    }

    public void savePlayer(){
        savedHealth=health;
        savedStrength=strength;
        savedSpeed=speed;
        savedEndurance=endurance;
        savedCritChance=critChance;
    }

    public void resetPlayer(){
        health=savedHealth;
        strength=savedStrength;
        speed=savedSpeed;
        critChance=savedCritChance;
        endurance=savedEndurance;
        damageMultiplier=1;
        position=0;
        isShielded=false;
        isStunned=false;
    }

    @Override 
    public void setPosition(String direction){
        if(direction.equals("away"))
            position-=distance;
        else if(direction.equals("close"))
            position+=distance;
    }

    public String getWeapon(){
        return weapon;
    }

    Enemy targetSelection(Enemy[] enemies) {
        while(true){
            System.out.println("Choose Target:");
            for(int i=0; i<enemies.length; i++) {
                if(enemies[i].getHealth()>0){
                    System.out.println((i + 1) + ". " + enemies[i].getName() + " [" + enemies[i].getHealth() + " HP remaining]");
                }
            }
            System.out.print("Target: ");
            int target=sc.nextInt();
            if(target>=1 && target<=enemies.length && enemies[target-1].getHealth()>0){
                return enemies[target-1];
            }
            System.out.println("Invalid target. Choose again.");
        }
    }

    void attackMenu(Fight fight){
        int attack;

        do{
            System.out.println("1. Light Attack: " + attacks[0].getAttackName());
            System.out.println("2. Heavy Attack: " + attacks[1].getAttackName());
            System.out.println("3. Cast Spell: : " + attacks[2].getAttackName());
            System.out.println("4. Ultimate Attack: " + attacks[3].getAttackName());
            System.out.print("Choose Attack: ");
            attack=sc.nextInt();
            if(attack<1 || attack>4){
                System.out.println("Invalid! Please choose a number between 1 and 4.");
            }
            else if(attack==4 && !isUltimateCharged()){
                System.out.println("Ultimate Attack is not charged! Kill 5 enemies to use an Ultimate Attack!");
            }
        }while(attack<1 || attack>4 || (attack==4 && !isUltimateCharged()));

        GameCharacter target;
        if(attack!=3 || (attack==3 && this instanceof Barbarian)){
            target=targetSelection(fight.getEnemyList());
        }
        else
            target=this;
        attacks[attack-1].performAttack(this, target);

        //Increase ultimate charge by 1 when killing an enemy.
        if(target.getHealth()<=0){
            increaseUltimateCharge();
        }

        //After using an ultimate, reset ultimate charge.
        if(attack==4){
            resetUltimateCharges();
        }
    }

    public double getHealth(){
        return health;
    }

    public void adjustPoints(int rewardPoints){}

    public void chooseAction(Fight fight){
        int choice;

        do {
            System.out.println("1. Attack");
            System.out.println("2. Block");
            System.out.println("3. Move Away");
            System.out.println("4. Move Closer");
            choice = sc.nextInt();
            if (choice<1 || choice>4)
                System.out.println("Invalid! Choose Again.");
        }while(choice<1 || choice>4);
        switch(choice){
            case 1:
                attackMenu(fight);
                break;
            case 2:
                if(Math.random()<0.80)
                    setShield(true);
                else
                    System.out.println("Block Attempt Failed!");
                break;
            case 3:
                setPosition("away");
                break;
            case 4:
                setPosition("close");
                break;
            default:
                System.out.println("Invalid! Choose Again.");
                chooseAction(fight);
        }
    }

    public void adjustStats(int rewardPoints){
        while(rewardPoints>0){
            int choice;
            do{
                System.out.println("Choose which stat to increase.");
                System.out.println("1. Health");
                System.out.println("2. Strength");
                System.out.println("3. Speed");
                System.out.println("4. Endurance");
                System.out.print("Stat: ");
                choice=sc.nextInt();
                if(choice<1 || choice>4){
                    System.out.println("Invalid Choice! Please choose a correct stat to increase.");
                }
            }while(choice<1 || choice>4);

            int value;
            System.out.println("Remaining Reward Points: " + rewardPoints);
            System.out.print("How many points do you want to allocate to the stat?: ");
            value=sc.nextInt();
            if(value<1 || value>rewardPoints){
                System.out.println("Invalid Input! Please Try Again.");
            }
            else{
                switch(choice){
                    case 1:
                        setHealth(value);
                        break;
                    case 2:
                        increaseStrengthStat(value);
                        break;
                    case 3: 
                        increaseSpeedStat(value);
                        break;
                    case 4:
                        increaseEnduranceStat(value);
                        break;
                }
                rewardPoints-=value;
            }
        }

    }

}
