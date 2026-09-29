package characters.player;

import attacks.Attack;

public class Swordsman extends Player{
    private int curseDamage;
    public Swordsman(){
        health=40;
        strength=30;
        speed=80;
        endurance=50;
        mana=35;
        weapon="Sword";
        attackEffect="Curse";
        curseDamage=15;
        assignAttacks();
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Quick Slash", "Light", 25, "Curse");
        attacks[1]=new Attack("Cleaving Strike", "Heavy", 40, "Curse");
        attacks[2]=new Attack("Flash-Feet", "Spell", 0, "Speed-Boost");
        attacks[3]=new Attack("Ultimate: King's Execution", "Ultimate", 120, "Speed-Boost");
    }
}
