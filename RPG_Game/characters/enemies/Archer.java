package characters.enemies;

import attacks.Attack;
import characters.player.Player;

public class Archer extends Enemy{
    private Attack[] attacks=new Attack[1];

    public Archer(){
        super();
        health=50;
        strength=25;
        mana=0;
        speed=25;
        endurance=20;
        reward=1;
        position=6;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Arrow Barrage","Heavy", 25, "None");
    }

    @Override 
    public void chooseAction(Player player){
        //1. Attack     2. Move Closer      3. Move Away
        int distance=calculateDistance(player.getPosition());
        if(distance<4){
            if(Math.random()<0.30){
                attacks[0].performAttack(this, player);
            }
            else{
                position+=5;
            }
        }
        else if(distance>=4 && distance<15){
            if(Math.random()<0.80){
                attacks[0].performAttack(this, player);
            }
            else{
                position+=5;
            }
        }
        else{
            position-=5;
        }
    }

}
