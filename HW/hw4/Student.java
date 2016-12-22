/**
 * This class represents full name, username, study hours, and non-study hours
    of students.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Student extends Person {

    private int studyHours = 0;
    private int nonStudyHours = 0;

    /**
     * Constructor for Student.
     * @param firstName The student's first name
     * @param lastName The student's last name
     * @param username The student's usernames
     */
    public Student(String firstName, String lastName, String username) {
        super(firstName, lastName, username);
        study(studyHours);
        relax(nonStudyHours);
    }

    /**
     * Accessor for Student.
     * @return studyHours, hours the student has spent studying
     */
    public int getStudyHours() {
        return studyHours;
    }

    /**
     * Accessor for Student.
     * @return nonStudyHours, hours the student has spent not studying
     */
    public int getNonStudyHours() {
        return nonStudyHours;
    }

    /**
     * Accessor for Student.
     * @return studyPercentage, the percentage of hours students studied
     */
    public double getStudyPercentage() {
        double studyPercentage = 0;
        if ((studyHours + nonStudyHours) != 0) {
            studyPercentage = studyHours * 100
                                / (studyHours + nonStudyHours);
        }

        return studyPercentage;

    }

    /**
     * @param hours should add the hours to studyHours
     */
    public void study(int hours) {
        if (hours >= 0) {
            studyHours = studyHours + hours;
        }
    }

    /**
     * @param hours should add the hours to nonStudyHours
     */
    public void relax(int hours) {
        if (hours >= 0) {
            nonStudyHours = nonStudyHours + hours;
        }
    }

    /**
     * @param args what we take from the user's input
     */
    public static void main(String[] args) {

        Student john = new Student("John", "Yi", "jyi62");
        john.study(8);
        john.relax(16);
        System.out.println("Name: " + john.getLastName() + ", "
                            + john.getFirstName() + "\n"
                            + "Username: " + john.getUsername() + "\n"
                            + "Study Hours: " + john.getStudyHours() + "\n"
                            + "Non-study Hours: " + john.getNonStudyHours()
                            + "\n" + "Study Percentage: "
                            + john.getStudyPercentage());
        john.study(3);
        john.relax(1);
        System.out.println("--Changed--" + "\n" + "Study Hours: "
                            + john.getStudyHours() + "\n" + "Non-study Hours: "
                            + john.getNonStudyHours() + "\n"
                            + "Study Percentage: " + john.getStudyPercentage());
    }


}
