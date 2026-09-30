package characters.player;

import attacks.Attack;

public class Rogue extends Player{
    public Rogue(){
        health=40;
        strength=40;
        speed=70;
        endurance=60;
        weapon="Gauntlets";
        assignAttacks();
    }

    @Override 
    protected void assignAttacks(){
        attacks[0]=new Attack("Rapid Strike", "Light", 30, "Power-Up");
        attacks[1]=new Attack("Shadowbreaker", "Heavy", 50, "Power-Up");
        attacks[2]=new Attack("Flaring Spirit", "Spell", 0, "Power-Surge");
        attacks[3]=new Attack("Ultimate: Thousand Fists", "Ultimate", 100, "Power-Surge");
    }
}
