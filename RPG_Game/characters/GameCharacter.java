package characters;

public class GameCharacter {
    protected String name;
    protected double health;
    protected double strength;
    protected int attackPoints;
    protected double speed;
    protected double endurance;
    protected boolean isShielded;
    protected boolean isStunned;
    protected double critChance;
    protected double damageMultiplier;
    protected int position;

    public GameCharacter(){
        isShielded=false;
        damageMultiplier=1;
        critChance=0.10;
    }

    protected void chooseAction(){}

    public void setPosition(int distance){}

    public int getPosition(){
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health += health;
    }

    public void setStrength(double strength) {
        this.strength *= strength;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints += attackPoints;
    }

    public void setSpeed(double speed) {
        this.speed *= speed;
    }

    public void setEndurance(double endurance) {
        this.endurance *= endurance;
    }

    public void setShield(boolean isShielded) {
        this.isShielded = isShielded;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getStrength() {
        return strength;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public double getSpeed() {
        return speed;
    }

    public double getEndurance() {
        return endurance;
    }

    public boolean isShielded() {
        return isShielded;
    }

    public void setDamageMultiplier(double damageMultiplier){
        this.damageMultiplier*=damageMultiplier;
    }

    public void boostCritChance(){
        this.critChance *= 1.5;
    }

    public void setStun(){
        if(Math.random()<0.15)
            isStunned=true;
        else
            isStunned=false;
    }

    public void resetTemporaryBuffs(){}

}
