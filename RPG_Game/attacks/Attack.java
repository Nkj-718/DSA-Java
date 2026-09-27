package attacks;

public class Attack {
    private String attackName;
    private double attackPower;
    private String attackEffect;
    private String position;
   
    public Attack(String attackName, double attackPower, String position) {
        this.attackName = attackName;
        this.attackPower = attackPower;
        this.position = position;
    }

    public Attack(String attackName, double attackPower, String attackEffect, String position) {
        this(attackName, attackPower, position);
        this.attackEffect = attackEffect;
    }

    boolean hasMissed(){
        return (Math.random()<0.10);
    }

    boolean isCrit(){
        return (Math.random()<0.10);
    }

    boolean isCrit(String weapon){
        if(weapon=="Spear")
            return Math.random()<0.30;
        return Math.random()<0.10;
    }

    double calculateDamage(Attack attack,double strength, double range, double damageMultiplier){}

    double adjustPosition(double initialPosition, double changedPosition){}

    boolean isBlocked(){
        return (Math.random()<0.80);
    }

    String getAttackEffect(){}

}
