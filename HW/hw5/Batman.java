/**
 * This class represents ablility of Batman, a Rebel soldier.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Batman extends RebelSoldier {

    /**
     * Constructor for Batman.
     * @param health The health value this Soldier should begin with.
     * @param attack The attack value this Soldier should begin with.
     * @param defense The defense value this Soldier should begin with.
     * @param identifier The identifier of this Soldier.
     */
    public Batman(double health, double attack, double defense,
                            String identifier) {
        super(health, attack, defense, identifier);
    }

    /**
     * Represents the force of Batman
     */
    public void useTheForce() {
        heal(2.0);
        changeDefense(1.5);
    }

    /**
     * @param target The Soldier to attack.
     * @return The amount of damage dealt to the target Soldier.
     */
    public double attack(Soldier target) {
        target.hurt(60.0);
        return getAttack();
    }


    @Override
    public String getName() {
        return "Batman " + getIdentifier();
    }

}
