package attacks;

import characters.enemies.*;
import characters.player.*;

public class Attack {
    private String attackName;
    private double attackPower;
    private String attackEffect;
    private String attackType;
   
    public Attack(String attackName, double attackPower, String attackType) {
        this.attackName = attackName;
        this.attackPower = attackPower;
        this.attackType=attackType;
    }

    public Attack(String attackName, String attackType, double attackPower, String attackEffect) {
        this(attackName, attackPower, attackType);
        this.attackEffect = attackEffect;
    }

    public String getAttackType(){
        return attackType;
    }

    boolean hasMissed(){
        return (Math.random()<0.10);
    }

    boolean isCrit(String weapon){
        if(weapon=="Spear")
            return Math.random()<0.30;
        return Math.random()<0.10;
    }

    double calculateDamage(double strength, double distance, double damageMultiplier){
        if(attackType="Light"){}
        else if(attackType="Heavy"){}
        else if(attackType="Spell"){}
        else if(attackType="Ultimate"){}
    }

    public String getAttackName(){
        return attackName;
    }

    double adjustPosition(double initialPosition, double distance){
        return initialPosition+distance;
    }

    boolean isBlocked(){
        return (Math.random()<0.80);
    }

    public void performAttack(Player player, Enemy target){
        if(attackType=="Light"){}
        else if(attackType=="Heavy"){}
        else if(attackType=="Spell"){}
        else if(attackType=="Ultimate"){}
    }

}
