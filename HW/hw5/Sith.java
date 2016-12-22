/**
 * This class represents the ability of a Sith in Empire team.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Sith extends Soldier implements ForceSensitive {

    private double power;
    private boolean usedF = false;

    /**
     * Constructor for Sith.
     * @param health The health value this Soldier should begin with.
     * @param attack The attack value this Soldier should begin with.
     * @param defense The defense value this Soldier should begin with.
     * @param identifier The identifier of this Soldier.
     */
    public Sith(double health, double attack, double defense,
                            String identifier) {
        super(health, attack, defense, identifier);
        power = (1 / 6) * (getDefense() + getAttack());
    }

    /**
     * Represents the force of Sith
     */
    public void useTheForce() {
        hurt(0.1 * power);
        changeAttack(power);
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
        return "Sith " + getIdentifier();
    }

}
