package attacks;

import characters.GameCharacter;
import characters.enemies.*;
import characters.player.*;
import java.util.Random;

public class Attack {
    private String attackName;
    private double attackPower;
    private String attackEffect;
    private String attackType;
   
    Random random=new Random();

    public Attack(String attackName, double attackPower, String attackEffect) {
        this.attackName = attackName;
        this.attackPower = attackPower;
        this.attackEffect=attackEffect;
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

    void triggerEffect(GameCharacter self, GameCharacter target){
        if(attackEffect=="Power-Up")
            self.setDamageMultiplier(1.15);
        if(attackEffect=="Power-Surge")
            self.setDamageMultiplier(1.5);
        if(attackEffect=="Attack-Boost")
            self.setStrength(1.5);
        if(attackEffect=="Stagger")
            target.setStun();
        if(attackEffect=="Crit-Boost")
            self.boostCritChance();
        if(attackEffect=="Speed-Boost")
            self.setSpeed(1.5);
        if(attackEffect=="Curse")
            target.setHealth(-20);
        if(attackEffect=="Block-Boost"){
            self.setShield(true);
            self.setDamageMultiplier(1.3);
        }
        if(attackEffect=="Self-Destruct")
            self.setHealth(-(self.getHealth()));
    }

    public void performAttack(GameCharacter self, GameCharacter target){
        if(attackType=="Spell"){
            triggerEffect(self, target);
        }
        else{
            double damage=calculateDamage();
            target.setHealth(-damage);
            triggerEffect(self, target);
        }
    }

    public void performAttack(Enemy[] enemies){
        if(attackEffect=="Heal")
            enemies[random.nextInt(enemies.length)].setDamageMultiplier(1.5);
        else if(attackEffect=="Attack-Boost")
            enemies[random.nextInt(enemies.length)].setHealth(40);
    }

}
