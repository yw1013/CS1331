/**
 * Item class represents an item, having name, weight, price, and barcode.
 * @author Alex Epifano & Thomas Shields
 * @version 1.0
 */
public class Item {

    private String name;
    private double weight;
    private double price;
    private long barcode;

    /**
     * Creates a new item with the specified weight and barcode. Initializes
     * name as null and price as 0.0.
     * @param  weight  The weight in grams of the item.
     * @param  barcode The barcode of the item.
     */
    public Item(double weight, long barcode) {
        name = null;
        price = 0.0;
        this.weight = weight;
        this.barcode = barcode;
    }

    /**
     * Create new item with the specified properties.
     * @param  name    The name of the item.
     * @param  weight  The weight of the item in grams.
     * @param  price   The price of the item in USD.
     * @param  barcode The barcode of the item.
     */
    public Item(String name, double weight, double price, long barcode) {
        this(weight, barcode);
        this.name = name;
        this.price = price;
    }

    /**
    * @return price
    */
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (this == null) {
            return false;
        }

        Item that = (Item) other;
        if (!(other instanceof Item)) {
            return false;
        }
        return (this.weight == that.weight && this.barcode == that.barcode);
    }

}
