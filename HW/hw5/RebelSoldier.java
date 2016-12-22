import java.util.Random;
/**
 * This class represents the ability of a rebelsoldier.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class RebelSoldier extends Soldier {
    /**
     * Constructor for RebelSoldier.
     * @param health The health value this Soldier should begin with.
     * @param attack The attack value this Soldier should begin with.
     * @param defense The defense value this Soldier should begin with.
     * @param identifier The identifier of this Soldier.
     */
    public RebelSoldier(double health, double attack, double defense,
                            String identifier) {
        super(health, attack, defense, identifier);
    }


    @Override
    public double attack(Soldier target) {
        Random rnd = new Random();
        if (rnd.nextInt(100) < 80) {
            target.hurt(getAttack());
            return getAttack();
        } else {
            return 0.0;
        }
    }


    @Override
    public String getName() {
        return "Rebel Soldier " + getIdentifier();
    }

}
