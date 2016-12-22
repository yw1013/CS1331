/**
 * This class represents full name, username, study hours, and non-study hours
    of gradstudents.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class GradStudent extends Student {

    private int studyHours = 0;
    private int nonStudyHours = 0;

    /**
     * Constructor for GradStudent.
     * @param firstName The gradstudent's first name
     * @param lastName The gradstudent's last name
     * @param username The gradstudent's username
     */
    public GradStudent(String firstName, String lastName, String username) {
        super(firstName, lastName, username);
        this.studyHours = studyHours;
        this.nonStudyHours = nonStudyHours;
    }

    @Override

    /**
     * @param hours grad student’s nonStudyhours can't be greater than zero.
     */
    public void relax(int hours) {
    }

    /**
     * @param args what we take from the user's input
     */
    public static void main(String[] args) {

        GradStudent tony = new GradStudent("Tony", "Kim", "ikim75");
        tony.study(9);
        tony.relax(0);
        System.out.println("Name: " + tony.getLastName() + ", "
                            + tony.getFirstName() + "\n"
                            + "Username: " + tony.getUsername() + "\n"
                            + "Study Hours: " + tony.getStudyHours() + "\n"
                            + "Non-study Hours: " + tony.getNonStudyHours()
                            + "\n" + "Study Percentage: "
                            + tony.getStudyPercentage());
        tony.study(3);
        tony.relax(0);
        System.out.println("--Changed--" + "\n" + "Study Hours: "
                            + tony.getStudyHours() + "\n" + "Non-study Hours: "
                            + tony.getNonStudyHours() + "\n"
                            + "Study Percentage: " + tony.getStudyPercentage());
    }
}
