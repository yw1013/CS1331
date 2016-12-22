/**
 * Represents a class Gnome.
 *
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Gnome extends Card {

    /**
     * Constructs Gnome object. A Card worth gnome/victory points.
     */
    public Gnome() {
        super("Gnome", "make the other player randomly discard one of their own"
                + "but not added to the playing zone, removing them from the"
                + "game entirely.", "ggggGnome", true, 3);
    }

    @Override
    public void play(PlasterClash pc) {
        super.play(pc);
        for (Player opp : pc.opponents()) {
            opp.discardRandom();
        }
    }
}
