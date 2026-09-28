package characters.enemies;

import attacks.Attack;
import characters.player.*;

public class Knight extends Enemy{
    private Attack[] attacks=new Attack[1];

    public Knight(){
        super();
        enemyName="Knight";
        health=50;
        strength=20;
        mana=0;
        speed=25;
        endurance=30;
        reward=1;
        enemyPosition=3;
    }

    @Override
    void assignAttacks(){
        attacks[0]=new Attack("Sword Sweep", 20, "Damage");
    }

    @Override 
    public void chooseAction(Player player){
        //1. Attack     2. Move Closer
        double distance=calculateDistance(player.getPlayerPosition());
        if(distance<4){
            performAttack(attacks[0], player);
        }
        else{
            enemyPosition-=4;
        }
    }

    @Override 
    void performAttack(Attack attack, Player player){
        super.performAttack(attack, player);
    }

}
