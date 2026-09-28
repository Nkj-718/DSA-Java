package characters.enemies;

import attacks.Attack;
import characters.player.Player;

public class Enemy {
    protected String enemyName;
    protected double health;
    protected double strength;
    protected double mana;
    protected double speed;
    protected double endurance;
    protected int reward;
    protected double damageMultiplier;
    protected boolean isStunned;
    protected boolean isCursed;
    protected int enemyPosition;
    
    public Enemy(){
        damageMultiplier=1;
        isCursed=false;
        isStunned=false;
    }

    double calculateDistance(double playerPosition){
        return enemyPosition-playerPosition;
    }

    public void healHealth(){
        health+=40;
    }

    public void increaseDamageMultiplier(double buff){
        damageMultiplier*=buff;
    }

    public double getHealth(){
        return health;
    }

    public void chooseAction(Player player){};

    public void chooseAction(Enemy[] enemies, Player player){};

    void assignAttacks(){}

    void performAttack(Attack attack, Player player){
        System.out.println(enemyName + " used " + attack.getAttackName() + "!");
        if(attack.getAttackType()=="Damage"){
            double damage=attack.calculateDamage();
            player.setHealth(damage);
        }
    }

    public void chooseAction(){}

}
