package characters.enemies;

import characters.player.*;
import attacks.Attack;

class Warden extends Enemy{
    private Attack[] attacks=new Attack[2];

    Warden(){
        super();
        health=100;
        strength=35;
        mana=0;
        speed=20;
        endurance=50;
        reward=2;
        enemyPosition=4;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Axe Hammer", 40, "Damage");
        attacks[1]=new Attack("Boulder Throw", 30, "Damage");
    }

    @Override 
    public void chooseAction(Player player){
        double distance=calculateDistance(player.getPlayerPosition());
        //Perform either attacks[0](Axe Hammer-70%), move away(15%), or move closer(15%).
        if(distance<5){
            double value=Math.random();
            if(value<0.70)
                performAttack(attacks[0], player);
            else if(value>=0.70 && value<0.85)
                enemyPosition+=4;
            else
                enemyPosition-=4;
        }
        //Perform either attacks[1](Boulder Throw-70%),move away(5%), or move closer(25%)
        else if(distance>=5 && distance<15){
            double value=Math.random();
            if(value<0.70)
                performAttack(attacks[1], player);
            else if(value>=0.70 && value<0.75)
                enemyPosition+=4;
            else
                enemyPosition-=4;
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
