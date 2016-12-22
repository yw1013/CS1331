/**
 * This class represents the custom card.
 *
 * @author Yea Won Yoon
 * @version 1.0
 */
public class CustomCard extends Card {
    /**
     * Constructs a Custom Card object. It is not scorable.
     */
    public CustomCard() {
        super("Rock", "Worth 3 Keebles! Add 3 to the current keeble count.",
                "rrrrRock", false, 3);
    }

    /**
     * Gives the current player 3 Keebles.
     *
     * @param p the game object to affect
     */
    public void play(PlasterClash p) {
        super.play(p);
        playToPlayZone(p);
        p.incKeebles();
        p.incKeebles();
    }
}
