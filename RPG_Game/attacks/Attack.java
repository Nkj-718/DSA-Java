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
        this(attackName, attackPower, attackEffect);
        this.attackType = attackType;
    }

    public String getAttackType(){
        return attackType;
    }

    boolean hasMissed(){
        return Math.random()<0.10;
    }

    double calculateDamage(GameCharacter self, GameCharacter target){
        // Base Damage
        double damage=attackPower+(self.getStrength()*0.5);

        // Attack Type
        if(attackType.equals("Heavy"))
            damage*=1.15;
        else if(attackType.equals("Ultimate"))
            damage*=1.40;

        // Damage Multiplier
        damage*=self.getDamageMultiplier();

        // Critical Hit
        double critChance=self.getCritChance();
        if(attackEffect.equals("Critical!"))
            critChance=0.25;
        else if(attackEffect.equals("Guaranteed-Crit!"))
            critChance=1.0;
        boolean critical=Math.random()<critChance;
        if(critical){
            damage*=2;
            System.out.println("CRITICAL HIT!");
        }
        // Target Endurance
        double enduranceMultiplier=100.0/(100.0+target.getEndurance());
        damage*=enduranceMultiplier;
        return damage;
    }

    public String getAttackName(){
        return attackName;
    }

    double adjustPosition(double initialPosition, double distance){
        return initialPosition+distance;
    }

    void triggerEffect(GameCharacter self, GameCharacter target){
        if(attackEffect.equals("Power-Up"))
            self.setDamageMultiplier(0.5);
        if(attackEffect.equals("Power-Surge"))
            self.setDamageMultiplier(2);
        if(attackEffect.equals("Attack-Boost"))
            self.setStrength(1.5);
        if(attackEffect.equals("Stagger"))
            target.setStun(true);
        if(attackEffect.equals("Crit-Boost"))
            self.boostCritChance();
        if(attackEffect.equals("Speed-Boost"))
            self.setSpeed(1.5);
        if(attackEffect.equals("Curse"))
            target.setHealth(-20);
        if(attackEffect.equals("Block-Boost")){
            self.setShield(true);
            self.setDamageMultiplier(0.5);
        }
        if(attackEffect.equals("Self-Destruct"))
            self.setHealth(-(self.getHealth()/2));
    }

    public void performAttack(GameCharacter self, GameCharacter target){

        if("Spell".equals(attackType)){
            triggerEffect(self, target);
        }
        else{
            double damage;
            if(target.isShielded()){
                System.out.println(target.getName() + " is shielded.");
                damage=0;
            }
            else if(hasMissed()){
                System.out.println(self.getName() + "'s attack missed!");
                damage=0;
            }
            else
                damage=calculateDamage(self, target);
            target.setHealth(-damage);
            triggerEffect(self, target);
        }
    }

    public void performAttack(Enemy[] enemies){
        int index;
        do{
            index=random.nextInt(enemies.length);
        }while(enemies[index].getHealth()<=0);
        if(attackEffect.equals("Attack-Boost"))
            enemies[index].setDamageMultiplier(1.5);
        else if(attackEffect.equals("Heal"))
            enemies[index].setHealth(40);
    }

}
