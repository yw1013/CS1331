/**
 * This class represents full name, username, hope, and pizza of
    undergradstudents.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class UndergradStudent extends Student {

    private int hope = 100;
    private int pizza = 0;

    /**
     * Constructor for UndergradStudent.
     * @param firstName The undergradestudent's first name
     * @param lastName The undergradestudent's last name
     * @param username The undergradestudent's username
     */
    public UndergradStudent(String firstName, String lastName, String username)
    {
        super(firstName, lastName, username);
        loseHope(hope);
        eatPizza(pizza);
    }

    /**
     * Accessor for UndergradStudent.
     * @return hope, the undergrad’s hope remaining
     */
    public int getHope() {
        return hope;
    }

    /**
     * Accessor for UndergradStudent.
     * @return pizza, the undergrad’s pizza consumed
     */
    public int getPizza() {
        return pizza;
    }

    /**
     * @param hopeLoss should subtract hopeLoss from the hope
     */
    public void loseHope(int hopeLoss) {
        if (hopeLoss >= 0 && hopeLoss <= 100) {
            this.hope = hope - hopeLoss;
        }
    }

    /**
     * @param pizzas should add pizzas to the pizza count
     */
    public void eatPizza(int pizzas) {
        if (pizzas >= 0) {
            this.pizza = pizza + pizzas;
        }
    }

    /**
     * @param args what we take from the user's input
     */
    public static void main(String[] args) {

        UndergradStudent julie = new UndergradStudent("Julie", "Yoon",
                                                        "jyoon75");
        julie.eatPizza(30);
        julie.loseHope(12);
        System.out.println("Name: " + julie.getLastName() + ", "
                            + julie.getFirstName() + "\n"
                            + "Username: " + julie.getUsername() + "\n"
                            + "Remaining Hope: " + julie.getHope() + "\n"
                            + "Consumed Pizza: " + julie.getPizza());
        julie.eatPizza(2);
        julie.loseHope(10);
        System.out.println("--Changed--" + "\n" + "Remaining Hope: "
                            + julie.getHope() + "\n" + "Consumed Pizza: "
                            + julie.getPizza());
    }
}
