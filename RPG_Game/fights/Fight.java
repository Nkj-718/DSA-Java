package fights;
import characters.player.*;
import characters.enemies.*;
import characters.GameCharacter;

public class Fight {
    private int rewardPoints;
    protected Enemy[] enemies;

    public int getReward(){
        return rewardPoints;
    }

    private boolean areEnemiesAlive(){
        for(Enemy enemy : enemies){
            if(enemy.getHealth()>0)
                return true;
        }
        return false;
    }

    public Enemy[] getEnemyList(){
        return enemies;
    }

    private GameCharacter[] sortTurns(GameCharacter[] characters){
        for(int i=0; i<characters.length; i++){
            int max=i;
            for(int j=i+1; j<characters.length; j++){
                if(characters[j].getSpeed()>characters[max].getSpeed())
                    max=j;
            }
            GameCharacter temp=characters[i];
            characters[i]=characters[max];
            characters[max]=temp;
        }
        return characters;
    }

    void playTurn(Enemy[] enemies, Player player){
        GameCharacter[] characters=new GameCharacter[enemies.length+1];

        for (int i=0; i<enemies.length; i++){
            characters[i]=enemies[i];
        }
        characters[characters.length-1]=player;

        characters=sortTurns(characters);

        for(GameCharacter character : characters){
            //Perform Action
            if(character.getHealth()>0){

                if(!character.isStunned()){
                    if(character instanceof Cleric){
                        character.chooseAction(enemies, player);
                    }
                    else if(character instanceof Player){
                        player.chooseAction(this);
                    }
                    else{
                        character.chooseAction(player);
                    }
                }
                else{
                    System.out.println(character.getName() + " is Stunned!");
                    character.setStun(false);
                }

            }
            //If player Character dies, end turn.
            if(player.getHealth()<=0){
                System.out.println("You Died.");
                return;
            }

            //If enemies die, end turn.
            if(!areEnemiesAlive()){
                System.out.println("Enemies Vanquished! You Win.");
                return;
            }
        }

    }

    public boolean startFight(Player player){
        boolean levelFinished=false;

        do{
            playTurn(enemies, player);
        }while(player.getHealth()>0 && areEnemiesAlive());

        if(player.getHealth()>0)
            levelFinished=true;

        rewardPoints=0;
        for(Enemy enemy : enemies){
            if(enemy.getHealth()<=0){
                rewardPoints+=enemy.giveReward();
            }
        }

        return levelFinished;
    }

}
