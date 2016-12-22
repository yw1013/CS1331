/**
 * Represents a class Tree.
 *
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Tree extends Zone {

    /**
     * Constructs Tree object. Starts off with a Gnome Card and 9 Keeble
     * Cards in it.
     */
    public Tree() {
        for (int j = 0; j < 9; j++) {
            add(new Keeble());
        }
        add(new Gnome());
    }

}
