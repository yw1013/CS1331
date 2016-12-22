/**
 * This class represents the ability of a Jedi in Rebellion team.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Jedi extends Soldier implements ForceSensitive {

    private double power;
    private boolean usedF = false;

    /**
     * Constructor for Jedi.
     * @param health The health value this Soldier should begin with.
     * @param attack The attack value this Soldier should begin with.
     * @param defense The defense value this Soldier should begin with.
     * @param identifier The identifier of this Soldier.
     */
    public Jedi(double health, double attack, double defense,
                            String identifier) {
        super(health, attack, defense, identifier);
        power = 0.25 * getDefense();
    }

    /**
     * Represents the force of Jedi
     */
    public void useTheForce() {
        heal(0.25 * power);
        changeDefense(power);
        usedF = true;
    }


    /**
     * @param target The Soldier to attack.
     * @return The amount of damage dealt to the target Soldier.
     */
    public double attack(Soldier target) {
        target.hurt(getAttack());
        if (usedF) {
            changeDefense(-power);
        }
        return (getAttack());
    }


    @Override
    public String getName() {
        return "Jedi " + getIdentifier();
    }

}
