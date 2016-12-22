/**
 * This class represents ablility of Joker, a Empire soldier.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Joker extends Stormtrooper {

    /**
     * Constructor for Joker.
     * @param health The health value this Soldier should begin with.
     * @param attack The attack value this Soldier should begin with.
     * @param defense The defense value this Soldier should begin with.
     * @param identifier The identifier of this Soldier.
     */
    public Joker(double health, double attack, double defense,
                            String identifier) {
        super(health, attack, defense, identifier);
    }

    /**
     * Represents the force of Batman
     */
    public void useTheForce() {
        heal(1.5);
        changeDefense(1.5);
    }

    /**
     * @param target The Soldier to attack.
     * @return The amount of damage dealt to the target Soldier.
     */
    public double attack(Soldier target) {
        target.hurt(70.0);
        return getAttack();
    }


    @Override
    public String getName() {
        return "Joker " + getIdentifier();
    }

}
