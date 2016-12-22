import java.util.Random;
/**
 * This class represents the ability of a stormtrooper in Empire team.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Stormtrooper extends Soldier {
    /**
     * Constructor for Stormtrooper.
     * @param health The health value this Soldier should begin with.
     * @param attack The attack value this Soldier should begin with.
     * @param defense The defense value this Soldier should begin with.
     * @param identifier The identifier of this Soldier.
     */
    public Stormtrooper(double health, double attack, double defense,
                            String identifier) {
        super(health, attack, defense, identifier);
    }


    @Override
    public double attack(Soldier target) {
        Random rnd = new Random();
        if (rnd.nextInt(100) < 60) {
            target.hurt(1.25 * getAttack());
            return (1.25 * getAttack());
        } else {
            return 0.0;
        }
    }


    @Override
    public String getName() {
        return "Stormtrooper " + getIdentifier();
    }

}
