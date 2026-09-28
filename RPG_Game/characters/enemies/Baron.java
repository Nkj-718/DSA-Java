package characters.enemies;

import attacks.Attack;
import characters.player.*;

class Baron extends Enemy{
    private Attack[] attacks=new Attack[4];
    private boolean isShielded;

    Baron(){
        super();
        health=300;
        strength=50;
        mana=30;
        speed=40;
        endurance=80;
        enemyPosition=5;
        isShielded=false;
    }

    public void setShield(boolean isShielded){
        this.isShielded=isShielded;
    }

    public boolean getShieldStatus(){
        return isShielded;
    }

    Baron(String phase2){
        this();
        health=500;
        strength=80;
        mana=50;
        speed=60;
        endurance=80;
        reward=10;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Full Counter", 1.3, "Buff");
        attacks[1]=new Attack("Axe Rampage", 80, "Damage");
        attacks[2]=new Attack("Shockwave", 60, "Damage");
        attacks[3]=new Attack("Detonation", 150, "Self-Destruct");
    }

    @Override 
    public void chooseAction(Player player){
        double distance=super.calculateDistance(player.getPlayerPosition());
        
        if(distance<6){
            //Perform either attacks[0](Full Counter-20%), attacks[1](Axe Rampage-70%), attacks[3](Detonation-5%), or move 5m away(5%). 
            double value=Math.random();
            if(value<20)
                performAttack(attacks[0], player);
            else if(value>=20 && value<90)
                performAttack(attacks[1], player);
            else if(value>=90 && value<95)
                performAttack(attacks[3], player);
            else
                enemyPosition+=4;
        }
        else if(distance>=6 && distance<15){
            //Perform either attacks[0](Full Counter-20%), attacks[2](Shockwave-50%), or move closer(30%)
            double value=Math.random();
            if(value<20)
                performAttack(attacks[0], player);
            else if(value>=20 && value<70)
                performAttack(attacks[2], player);
            else
                enemyPosition-=4;
        }
        else{
            //Perform either attacks[0](Full Counter-30%), or move closer(70%)
            if(Math.random()<0.30)
                performAttack(attacks[0], player);
            else
                enemyPosition-=4;
        }

    }

    @Override
    void performAttack(Attack attack, Player player){
        super.performAttack(attack, player);
        if(attack.getAttackType()=="Self-Destruct"){
            double damage=attack.calculateDamage();
            player.setHealth(damage);
            health/=2;
        }
        if(attack.getAttackType()=="Buff"){
            //Block Attack
            isShielded=true;
            increaseDamageMultiplier(1.3);
        }
    }

}
