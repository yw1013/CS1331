/**
 * Represents a class Steal.
 *
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Steal extends Card {
    /**
     * Constructs a Steal object. It is not scorable.
     */
    public Steal() {
        super("Extra Keeble", "Add 3 to the current keeble count. ",
                "Creamy Fruit Cake, with extra icing and fruits!",
                false, 3);
    }

    @Override
    public void play(PlasterClash p) {
        super.play(p);
        playToPlayZone(p);
        p.incKeebles();
        p.incKeebles();
        p.incKeebles();
    }
}
