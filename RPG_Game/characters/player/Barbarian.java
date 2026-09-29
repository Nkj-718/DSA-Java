package characters.player;

import attacks.Attack;

public class Barbarian extends Player{
    private double staggerChance;
    public Barbarian(){
        health=70;
        strength=80;
        speed=40;
        endurance=50;
        mana=15;
        weapon="Club";
        attackEffect="Stagger";
        staggerChance=10;
        assignAttacks();
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Savage Swing", "Light", 40, "Stagger");
        attacks[1]=new Attack("Earthshatter", "Heavy", 70, "Stagger");
        attacks[2]=new Attack("Blind Rush", "Spell", 20, "Attack-Boost");
        attacks[3]=new Attack("Ultimate: Worldbreaker", "Ultimate", 250, "None");
    }
}
