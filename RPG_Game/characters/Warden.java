package characters;

import attacks.Attack;
class Warden extends Enemy{
    private Attack[] attacks=new Attack[2];

    Warden(){
        super();
        health=100;
        strength=35;
        mana=0;
        speed=20;
        endurance=50;
        reward=2;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Axe Hammer", 40, "close");
        attacks[0]=new Attack("Boulder Throw", 30, "far");
    }

    @Override 
    void performAttack(){}

    @Override 
    String getAttackDescription(){}

}
