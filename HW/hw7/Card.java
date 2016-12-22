/**
 * Represents an abstract class Card.
 *
 * @author Yea Won Yoon
 * @version 1.0
 */
public abstract class Card {

    private String name;
    private String description;
    private String flavor;
    private boolean isScorable;
    private int cost;

    /**
     * Constructs Card object. Card includes a description, a block of flavor
     * text, whether it counts as a Gnome for scoring, and a Keeble cost.
     * @param name name of the card
     * @param description description of the card
     * @param flavor flavor text of the card
     * @param isScorable whether it counts as a Gnome for scoring
     * @param cost Keeble cost of the card
     */
    public Card(String name, String description, String flavor,
        boolean isScorable, int cost) {
        this.name = name;
        this.description = description;
        this.flavor = flavor;
        this.isScorable = isScorable;
        this.cost = cost;
    }

    /**
     * @return card's name
     */
    public String getName() {
        return name;
    }

    /**
     * @return card's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return card's flavor text
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     * @return true if it is Gnome
     */

    public boolean isScorable() {
        return isScorable;
    }

    /**
     * @return card's Keebles cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @param pc game object
     */
    public void playToPlayZone(PlasterClash pc) {
        Zone playZone = pc.getPlayZone();
        playZone.add(this);
    }

    /**
     * @param pc game object
     */
    public void play(PlasterClash pc) {
        Player current = pc.currentPlayer();
        Zone hand = current.getHand();
        hand.remove(this);
    }

    @Override
    public boolean equals(Object other) {
        if (null == other) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card)) {
            return false;
        }
        Card cd = (Card) other;
        return this.getName().equals(cd.getName());
    }

    @Override
    public int hashCode() {
        int num = 17;
        num = 31 * num + this.getName().hashCode();
        return num;
    }

    @Override
    public String toString() {
        String attribute = "";
        attribute +=  this.getName() + " (" + this.getCost() + ")";
        return attribute;
    }

}
