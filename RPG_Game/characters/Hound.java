package characters;

import attacks.Attack;

class Hound extends Enemy{
    private Attack[] attacks=new Attack[3];

    Hound(){
        super();
        health=200;
        strength=50;
        mana=20;
        speed=40;
        endurance=80;
        reward=5;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Bite", 60, "close");
        attacks[1]=new Attack("Pounce", 20, "far");
        attacks[2]=new Attack("Howl", 1.3, "buff");
    }

    @Override
    void performAttack(){}

    @Override 
    String getAttackDescription(){}

}
