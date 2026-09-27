package characters;

import attacks.Attack;

class Knight extends Enemy{
    private Attack[] attacks=new Attack[1];

    Knight(){
        super();
        health=50;
        strength=20;
        mana=0;
        speed=25;
        endurance=30;
        reward=1;
    }

    @Override
    void assignAttacks(){
        attacks[0]=new Attack("Sword Sweep", 20, "close");
    }

    @Override 
    void performAttack(){
        //calculate Damage of attack here.
    }

    @Override 
    String getAttackDescription(){}

}
