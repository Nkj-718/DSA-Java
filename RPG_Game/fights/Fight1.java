package fights;
import characters.player.*;
import characters.enemies.*;

public class Fight1 extends Fight{
    private Enemy[] enemies=new Enemy[1];

    public Fight1(){
        enemies[0]=(Knight) new Knight();
    }

    @Override 
    public double getCombinedHealth(){
        double combinedHealth=0;
        for(Enemy i : enemies){
            combinedHealth+=i.getHealth();
        }
        return combinedHealth;
    }
    
    @Override 
    public void startFight(Player player){
        while(player.getHealth()!=0 || getCombinedHealth()!=0){
            for(Enemy enemy : enemies){
                enemy.chooseAction(enemies, player);   
            }
        }
    }

}
