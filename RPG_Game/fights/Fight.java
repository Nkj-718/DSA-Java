package fights;
import characters.player.*;
import characters.enemies.*;
import characters.GameCharacter;

public class Fight {
    protected Enemy[] enemies;
    
    public void startFight(Player player){}

    public Enemy enemySelection(Enemy enemy){
        return enemy;
    }

    private GameCharacter[] sortTurns(GameCharacter[] characters){
        for(int i=0; i<characters.length; i++){
            int min=i;
            for(int j=i+1; j<characters.length; j++){
                if(characters[j].getSpeed()<characters[min].getSpeed())
                    min=j;
            }
            GameCharacter temp=characters[i];
            characters[i]=characters[min];
            characters[min]=temp;
        }
        return characters;
    }

    void turn(Enemy[] enemies, Player player){
        GameCharacter[] characters=new GameCharacter[enemies.length+1];

        for (int i=0; i<enemies.length; i++){
            characters[i]=enemies[i];
        }
        characters[characters.length-1]=player;

        characters=sortTurns(characters);

        for(GameCharacter character : characters){
            
        }

    }

    public double getCombinedHealth();

}
