package characters;

import attacks.Attack;

class Cleric extends Enemy{
    private Attack[] attacks=new Attack[2];

    Cleric(){
        super();
        health=50;
        strength=0;
        mana=30;
        speed=30;
        endurance=20;
        reward=1;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Healing Spell", 35, "buff");
        attacks[1]=new Attack("Damage Boost", 1.5, "buff");
    }

    @Override 
    void performAttack(){}

    @Override 
    String getAttackDescription(){}

}
