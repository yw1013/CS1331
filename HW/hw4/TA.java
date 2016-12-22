/**
 * This class represents full name, username, piazza score, recitation score,
    and office hours score of TAs.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class TA extends UndergradStudent {

    private double piazzaScore;
    private double recitationScore;
    private double officeHoursScore;

    /**
     * Constructor for TA.
     * @param firstName The undergradestudent's first name
     * @param lastName The undergradestudent's last name
     * @param username The undergradestudent's username
     * @param piazzaScore Rating on Piazza
     * @param recitationScore Rating in Recitation
     * @param officeHoursScore Rating in Office Hours
     */
    public TA(String firstName, String lastName, String username,
                double piazzaScore, double recitationScore,
                double officeHoursScore) {
        super(firstName, lastName, username);
        this.piazzaScore = piazzaScore;
        this.recitationScore = recitationScore;
        this.officeHoursScore = officeHoursScore;
        setPiazzaScore(piazzaScore);
        setRecitationScore(recitationScore);
        setOfficeHoursScore(officeHoursScore);
    }

    /**
     * Accessor for TA.
     * @return piazzaScore, rating on Piazza
     */
    public double getPiazzaScore() {
        return piazzaScore;
    }

    /**
     * Accessor for TA.
     * @return recitationScore, rating in Recitation
     */
    public double getRecitationScore() {
        return recitationScore;
    }

    /**
     * Accessor for TA.
     * @return officeHoursScore, rating in Office Hours
     */
    public double getOfficeHoursScore() {
        return officeHoursScore;
    }

    /**
     * @param piazzaScore set range of the TA's rating in Piazza
     */
    public void setPiazzaScore(double piazzaScore) {
        if (piazzaScore >= 0 && piazzaScore <= 1) {
            this.piazzaScore = piazzaScore;
        }
    }

    /**
     * @param recitationScore set range of the TA's rating in recitation
     */
    public void setRecitationScore(double recitationScore) {
        if (recitationScore >= 0 && recitationScore <= 1) {
            this.recitationScore = recitationScore;
        }
    }

    /**
     * @param officeHoursScore set range of the TA's rating in office hours
     */
    public void setOfficeHoursScore(double officeHoursScore) {
        if (officeHoursScore >= 0 && officeHoursScore <= 1) {
            this.officeHoursScore = officeHoursScore;
        }
    }

    /**
     * @param args what we take from the user's input
     */
    public static void main(String[] args) {

        TA jeung = new TA("Jeung", "Lee", "jelee13", 0.8, 0.9, 1);

        System.out.println("Name: " + jeung.getLastName() + ", "
                            + jeung.getFirstName() + "\n"
                            + "Username: " + jeung.getUsername() + "\n"
                            + "Piazza Rate: " + jeung.getPiazzaScore() + "\n"
                            + "Recitation Rate: " + jeung.getRecitationScore()
                            + "\n" + "Office Hour Rate: "
                            + jeung.getOfficeHoursScore());
    }

}
