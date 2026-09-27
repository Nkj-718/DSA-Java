package characters;

import attacks.Attack;

class Archer extends Enemy{
    private Attack[] attacks=new Attack[1];

    Archer(){
        super();
        health=50;
        strength=25;
        mana=0;
        speed=25;
        endurance=20;
        reward=1;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Arrow Barrage", 25, "far");
    }

    @Override 
    void performAttack(){
        //calculate Damage of attack here.
    }

    @Override 
    String getAttackDescription(){}

}
