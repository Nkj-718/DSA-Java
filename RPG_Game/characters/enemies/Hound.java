package characters.enemies;

import attacks.Attack;
import characters.player.*;

class Hound extends Enemy{
    private Attack[] attacks=new Attack[3];

    Hound(){
        super();
        health=200;
        strength=50;
        mana=20;
        speed=40;
        endurance=80;
        reward=5;
        enemyPosition=5;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Bite", 60, "Damage");
        attacks[1]=new Attack("Pounce", 20, "Movement");
        attacks[2]=new Attack("Howl", 1.3, "Buff");
    }

    @Override 
    public void chooseAction(Player player){
        double distance=calculateDistance(player.getPlayerPosition());
        //Perform either attacks[0](Bite-60%), attacks[2](Howl-20%), move closer(10%), or move away(10%).
        if(distance<6){
            double value=Math.random();
            if(value<0.60)
                performAttack(attacks[0], player);
            else if(value>=0.60 && value<0.80)
                performAttack(attacks[2], player);
            else if(value>=0.80 && value<0.90)
                enemyPosition-=5;
            else
                enemyPosition+=5;
        }
        //Perform either attacks[1](Pounce-50%), attacks[2](Howl-30%), Move away(5%) or move closer(15%)
        else if(distance>=6 && distance<15){
            double value=Math.random();
            if(value<0.50)
                performAttack(attacks[1], player);
            else if(value>=0.50 && value<0.80)
                performAttack(attacks[2], player);
            else if(value>=0.80 && value<0.85)
                enemyPosition+=5;
            else
                enemyPosition-=5;
        }
        else{
            double value=Math.random();
            if(value<0.40)
                performAttack(attacks[2], player);
            else
                enemyPosition-=4;
        }
    }

    @Override
    void performAttack(Attack attack, Player player){
        super.performAttack(attack, player);
        if(attack.getAttackType()=="Movement"){
            double damage=attack.calculateDamage();
            player.setHealth(damage);
            enemyPosition-=3;
        }
        else if(attack.getAttackType()=="Buff"){
            increaseDamageMultiplier(1.3);
            speed*=1.3;
        }
    }

}
