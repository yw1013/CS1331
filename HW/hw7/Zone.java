import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Represents a class Zone.
 *
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Zone {
    private ArrayList<Card> arrCard;

    /**
     * Constructs a Zone object. Zone has a backing list of cards.
     */
    public Zone() {
        this.arrCard = new ArrayList<Card>();
    }

    /**
     * @return iterated cards
     */
    public Iterator<Card> iterator() {
        return arrCard.iterator();
    }

    /**
     * @param ca cards
     */
    public void add(Card ca) {
        arrCard.add(ca);
    }

    /**
     * @param cr cards
     * @return removed cards
     */
    public Card remove(Card cr) {
        arrCard.remove(cr);
        return cr;
    }

    /**
     * @param gc index of card
     * @return card of the given index
     */
    public Card get(int gc) {
        return arrCard.get(gc);
    }

    /**
     * @param ri used to remove card
     * @return removed cards
     */
    public Card remove(int ri) {
        Card abc = arrCard.get(ri);
        arrCard.remove(ri);
        return abc;
    }

    /**
     * @param mct transfer cards to this zone
     */
    public void moveCardsTo(Zone mct) {
        for (Card ex : arrCard) {
            mct.add(ex);
        }
        arrCard.clear();
    }

    /**
     * shuffle cards
     */
    public void shuffle() {
        Collections.shuffle(arrCard);
    }

    /**
     * @param ch check cards
     * @return boolean value for existence of card in arraylist
     */
    public boolean contains(Card ch) {
        return arrCard.contains(ch);
    }

    /**
     * @return array of discarded cards
     */
    public ArrayList<Card> discardAll() {
        ArrayList<Card> discard = new ArrayList<Card>();
        for (Card ex : arrCard) {
            discard.add(ex);
        }
        arrCard.clear();
        return discard;
    }

    /**
     * @return size of arraylist
     */
    public int size() {
        return arrCard.size();
    }

    /**
     * @return number of Gnomes
     */
    public int numGnomes() {
        int num = 0;
        Gnome ng = new Gnome();
        for (Card ex : arrCard) {
            if (ex.equals(ng)) {
                num++;
            }
        }
        return num;
    }

    @Override
    public String toString() {
        String str = "";
        for (int j = 0; j < this.arrCard.size(); j++) {
            str += (j + ": " + this.get(j).getName() + " ("
                + this.get(j).getCost() + ")\n");
        }
        return str;
    }
}
