/**
 * This class represents full name and username of people.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Person {

    private String firstName;
    private String lastName;
    private String username;

    /**
     * Constructor for Person.
     * @param firstName The person’s first name
     * @param lastName The person’s last name
     * @param username The person’s username
     */
    public Person(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    /**
     * Accessor for Person.
     * @return the firstname of a person.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Accessor for Person.
     * @return the lastname of a person.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Accessor for Person.
     * @return the username of a person.
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param args what we take from the user's input
     */
    public static void main(String[] args) {

        Person yeawon = new Person("Yea Won", "Yoon", "yyoon75");
        System.out.println("Name: " + yeawon.getLastName() + ", "
                            + yeawon.getFirstName() + "\n"
                            + "Username: " + yeawon.getUsername());
    }

}
