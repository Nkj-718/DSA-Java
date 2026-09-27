package characters;

import attacks.Attack;

class Baron extends Enemy{
    private Attack[] attacks=new Attack[4];

    Baron(){
        super();
        health=300;
        attackPower=50;
        spellPower=0;
        speed=40;
        endurance=80;
    }

    Baron(String phase2){
        this();
        health=500;
        strength=80;
        mana=50;
        speed=60;
        endurance=80;
        reward=10;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Full Counter", 1.3, "buff");
        attacks[1]=new Attack("Axe Rampage", 80, "close");
        attacks[2]=new Attack("Shockwave", 60, "far");
        attacks[3]=new Attack("Detonation", 150, "close");
    }

    @Override
    void performAttack(){}

    @Override 
    String getAttackDescription(){}
}
