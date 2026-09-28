package characters.player;

import attacks.Attack;

public class Rogue extends Player{
    private double damageMultiplier;
    public Rogue(){
        health=40;
        strength=40;
        speed=70;
        endurance=60;
        mana=30;
        weapon="Gauntlets";
        attackEffect="Power-Up";
        damageMultiplier=1;
        assignAttacks();
    }

    void setDamageMultiplier(){
        damageMultiplier*=3;
    }

    void resetDamageMultiplier(){
        damageMultiplier=1;
    }

    @Override 
    void assignAttacks(){
        attacks[0]=new Attack("Rapid Strike", "Light", 30, "Power-Up");
        attacks[1]=new Attack("Shadowbreaker", "Heavy", 50, "Power-Up");
        attacks[2]=new Attack("Phantom Fist", "Spell", 50, "None");
        attacks[3]=new Attack("Ultimate: Thousand Fists", "Ultimate", 100, "Boost");
    }
}
