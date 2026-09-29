package characters.enemies;

import attacks.Attack;
import characters.player.*;
import java.util.Random;

public class Cleric extends Enemy{
    private Attack[] attacks=new Attack[2];
    Random random=new Random();

    public Cleric(){
        super();
        health=50;
        strength=0;
        mana=30;
        speed=30;
        endurance=20;
        reward=1;
        position=5;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Healing Spell", "Spell", 0, "Heal");
        attacks[1]=new Attack("Damage Boost", "Spell", 0, "Attack-Boost");
    }

    @Override 
    public void chooseAction(Enemy[] enemies, Player player){
        double distance=calculateDistance(player.getPlayerPosition());
        //Perform either attacks[0](Healing Spell-25%), attacks[1](Damage Boost-25%), or Move away(50%)
        if(distance<6){
            if(Math.random()<0.50){
                position+=4;
            }
            else{
                performAttack(enemies, attacks[random.nextInt(2)], player);
            }
        }
        //Either Perform attacks[0](Healing Spell-30%), attacks[1](Damage Boost-40%), or Move Away(20%)
        else{
            double value=Math.random();
            if(value<0.40){
                attacks[1].performAttack(enemies, player);
            }
            else if(value>=0.40 && value<0.70){
                performAttack(enemies, attacks[0], player);
            }
            else{
                position+=4;
            }
        }
    }

}
