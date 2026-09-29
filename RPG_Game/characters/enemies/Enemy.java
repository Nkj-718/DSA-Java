package characters.enemies;

import attacks.Attack;
import characters.GameCharacter;
import characters.player.Player;

public class Enemy extends GameCharacter{
    
    protected int reward;
    protected boolean isCursed;
    
    public Enemy(){
        damageMultiplier=1;
        isCursed=false;
        isStunned=false;
    }

    int calculateDistance(int playerPosition){
        return position-playerPosition;
    }

    public void chooseAction(Player player){};

    public void chooseAction(Enemy[] enemies, Player player){};

    void assignAttacks(){}

    public void stunEnemy(){
        if(Math.random()<0.15)
            isStunned=true;
        else
            isStunned=false;
    }

    public void chooseAction(){}

}
