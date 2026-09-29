package characters.enemies;

import characters.player.*;
import attacks.Attack;

public class Warden extends Enemy{
    private Attack[] attacks=new Attack[2];

    public Warden(){
        super();
        health=100;
        strength=35;
        mana=0;
        speed=20;
        endurance=50;
        reward=2;
        position=4;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Axe Hammer", "Heavy", 40, "None");
        attacks[1]=new Attack("Boulder Throw", "Heavy", 30, "None");
    }

    @Override 
    public void chooseAction(Player player){
        double distance=calculateDistance(player.getPosition());
        //Perform either attacks[0](Axe Hammer-70%), move away(15%), or move closer(15%).
        if(distance<5){
            double value=Math.random();
            if(value<0.70)
                attacks[0].performAttack(this, player);
            else if(value>=0.70 && value<0.85)
                position+=4;
            else
                position-=4;
        }
        //Perform either attacks[1](Boulder Throw-70%),move away(5%), or move closer(25%)
        else if(distance>=5 && distance<15){
            double value=Math.random();
            if(value<0.70)
                attacks[1].performAttack(this, player);
            else if(value>=0.70 && value<0.75)
                position+=4;
            else
                position-=4;
        }
        else{
            position-=4;
        }
    }

}
