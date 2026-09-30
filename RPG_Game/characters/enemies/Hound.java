package characters.enemies;

import attacks.Attack;
import characters.player.*;

public class Hound extends Enemy{
    private Attack[] attacks=new Attack[3];

    public Hound(){
        super();
        name="Hound of the Baron";
        health=200;
        strength=50;
        speed=40;
        endurance=80;
        reward=50;
        position=5;
        assignAttacks();
    }

    @Override 
    protected void assignAttacks(){
        attacks[0]=new Attack("Bite", "Heavy", 60, "None");
        attacks[1]=new Attack("Fear Manifest", "Light", 20, "Attack-Boost");
        attacks[2]=new Attack("Howl", "Spell", 0, "Attack-Boost");
    }

    @Override 
    public void chooseAction(Player player){
        double distance=calculateDistance(player.getPosition());
        //Perform either attacks[0](Bite-60%), attacks[2](Howl-20%), move closer(10%), or move away(10%).
        if(distance<6){
            double value=Math.random();
            if(value<0.60)
                attacks[0].performAttack(this, player);
            else if(value>=0.60 && value<0.80)
                attacks[2].performAttack(this, player);
            else if(value>=0.80 && value<0.90)
                position-=5;
            else
                position+=5;
        }
        //Perform either attacks[1](Fear Manifest-50%), attacks[2](Howl-30%), Move away(5%) or move closer(15%)
        else if(distance>=6 && distance<15){
            double value=Math.random();
            if(value<0.50)
                attacks[1].performAttack(this, player);
            else if(value>=0.50 && value<0.80)
                attacks[2].performAttack(this, player);
            else if(value>=0.80 && value<0.85)
                position+=5;
            else
                position-=5;
        }
        else{
            double value=Math.random();
            if(value<0.40)
                attacks[2].performAttack(this, player);
            else
                position-=4;
        }
    }

}
