package fights;
import characters.player.*;
import characters.enemies.*;

public abstract class Fight {
    
    public void startFight(Player player){}

    public Enemy enemySelection(Enemy enemy){
        return enemy;
    }

    public abstract double getCombinedHealth();

}
