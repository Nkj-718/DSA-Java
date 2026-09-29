package fights;

import characters.enemies.*;
import characters.player.*;

public class RandomFight extends Fight{
    
    public RandomFight(){
        enemies=new Enemy[4];

        for(int i=0; i<4; i++){
            double value=Math.random();
            if(value<0.25)
                enemies[i]=new Knight();
            else if(value>=0.25 && value<0.50)
                enemies[i]=new Archer();
            else if(value>=0.50 && value<0.75)
                enemies[i]=new Cleric();
            else
                enemies[i]=new Warden();
        }
        
    }
    
}
