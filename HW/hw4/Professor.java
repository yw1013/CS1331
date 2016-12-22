/**
 * This class represents full name, username, funny rating, and gpa of
    professors.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Professor extends Person {

    private double funnyFactor;
    private double gpa;

    /**
     * Constructor for Professor.
     * @param firstName The professor's first name
     * @param lastName The professor's last name
     * @param username The professor's username
     * @param funnyFactor The professor’s funny rating
     * @param gpa The professor’s average GPA
     */
    public Professor(String firstName, String lastName, String username,
                    double funnyFactor, double gpa) {
        super(firstName, lastName, username);
        setFunnyFactor(funnyFactor);
        setGPA(gpa);
    }

    /**
     * Accessor for Professor.
     * @return funnyFactor, The professor’s funny rating
     */
    public double getFunnyFactor() {
        return funnyFactor;
    }

    /**
     * Accessor for Professor.
     * @return gpa, The professor’s average GPA
     */
    public double getGPA() {
        return gpa;
    }

    /**
     * @param funnyFactor set range of the professor’s funny rating
     */
    public void setFunnyFactor(double funnyFactor) {
        if (funnyFactor >= 0 && funnyFactor <= 1) {
            this.funnyFactor = funnyFactor;
        }
    }

    /**
     * @param newGpa set range of the professor’s average GPA
     */
    public void setGPA(double newGpa) {
        if (newGpa >= 0 && newGpa <= 4) {
            this.gpa = newGpa;
        }
    }

    /**
     * @param args what we take from the user's input
     */
    public static void main(String[] args) {

        Professor kelly = new Professor("Kelly", "Yoo", "gyoo7", 1, 2.3);
        System.out.println("Name: " + kelly.getLastName() + ", "
                            + kelly.getFirstName() + "\n"
                            + "Username: " + kelly.getUsername() + "\n"
                            + "Funniness: " + kelly.getFunnyFactor() + "\n"
                            + "Average GPA: " + kelly.getGPA());
    }


}
