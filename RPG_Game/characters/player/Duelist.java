package characters.player;

import attacks.Attack;

public class Duelist extends Player{
    public Duelist(){
        health=60;
        strength=50;
        speed=50;
        endurance=60;
        mana=25;
        weapon="Spear";
        attackEffect="Critical!";
        critChance=0.25;
        assignAttacks();
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Quick Thrust", "Light", 35, "Critical!");
        attacks[1]=new Attack("Impaling Lunge", "Heavy", 60, "Critical!");
        attacks[2]=new Attack("Hawk's Gaze", "Spell", 0, "Crit-Boost");
        attacks[3]=new Attack("Ultimate: Dance of Spears", "Ultimate", 100, "Guaranteed-Crit!");
    }
}
