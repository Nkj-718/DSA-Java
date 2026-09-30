package characters.enemies;

import attacks.Attack;
import characters.player.*;

public class Knight extends Enemy{
    private Attack[] attacks=new Attack[1];

    public Knight(){
        super();
        name="Knight";
        health=50;
        strength=20;
        speed=25;
        endurance=30;
        reward=10;
        position=3;
        assignAttacks();
    }

    @Override
    protected void assignAttacks(){
        attacks[0]=new Attack("Sword Sweep","Heavy", 20, "None");
    }

    @Override 
    public void chooseAction(Player player){
        //1. Attack     2. Move Closer
        int distance=calculateDistance(player.getPosition());
        if(distance<4){
            attacks[0].performAttack(this, player);
        }
        else{
            position-=4;
        }
    }

}
