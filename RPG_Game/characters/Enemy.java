package characters;

import attacks.Attack;

abstract class Enemy {
    protected double health;
    protected double strength;
    protected double mana;
    protected double speed;
    protected double endurance;
    protected int reward;
    protected double damageMultiplier;
    protected boolean isStunned;
    protected boolean isCursed;
    
    Enemy(){
        damageMultiplier=1;
        isCursed=false;
        isStunned=false;
    }

    void assignAttacks(){}

    void performAttack(){}

    String getAttackDescription(){}

}
