import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * Represents a class Field.
 *
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Field {

    private HashMap<Card, Integer> fieldMap;

    /**
     * Constructs Field object. Field has A set of cards the player can
     * purchase.
     */
    public Field() {
        this.fieldMap = new HashMap<Card, Integer>();
        fieldMap.put(new Gnome(), 10);
        fieldMap.put(new GardenBread(), 100);
        fieldMap.put(new CustomCard(), 3);
    }

    /**
     * @return arraylist of cards
     */
    public ArrayList<Card> cards() {
        ArrayList<Card> arr = new ArrayList<Card>();
        Set se = fieldMap.keySet();
        Iterator iter = se.iterator();
        while (iter.hasNext()) {
            arr.add((Card) iter.next());
        }
        return arr;
    }

    /**
     * @param bc card for buyCard
     */
    public void buyCard(Card bc) {
        if (fieldMap.containsKey(bc)) {
            int isLeft = fieldMap.get(bc);
            if (isLeft > 1) {
                isLeft = isLeft - 1;
                fieldMap.put(bc, isLeft);
            } else if (isLeft == 1) {
                fieldMap.remove(bc);
            } else {
                System.out.println("Error. Does not exist.");
            }
        }
    }

}
