package characters.enemies;

import attacks.Attack;
import characters.player.Player;

class Archer extends Enemy{
    private Attack[] attacks=new Attack[1];

    Archer(){
        super();
        health=50;
        strength=25;
        mana=0;
        speed=25;
        endurance=20;
        reward=1;
        enemyPosition=6;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Arrow Barrage", 25, "Damage");
    }

    @Override 
    public void chooseAction(Player player){
        //1. Attack     2. Move Closer      3. Move Away
        double distance=calculateDistance(player.getPlayerPosition());
        if(distance<4){
            if(Math.random()<0.30){
                performAttack(attacks[0], player);
            }
            else{
                enemyPosition+=5;
            }
        }
        else if(distance>=4 && distance<15){
            if(Math.random()<0.80){
                performAttack(attacks[0], player);
            }
            else{
                enemyPosition+=5;
            }
        }
        else{
            enemyPosition-=5;
        }
    }

    @Override 
    void performAttack(Attack attack, Player player){
        super.performAttack(attack, player);
    }

}
