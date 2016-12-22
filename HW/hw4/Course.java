/**
 * This class represents title, professor, headTA, TA, students of the course.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Course {

    private String title;
    private Professor professor;
    private TA headTA;
    private TA[] tas;
    private Student[] students;
    private int numStudent = 0;
    private double totalSP = 0;

    /**
     * Constructor for Course.
     * @param title Course title, e.g ”CS 1331”
     * @param professor The course’s professor
     * @param headTA The course’s head TA
     * @param tas The course’s TAs
     * @param students The course’s students
     */
    public Course(String title, Professor professor, TA headTA, TA[] tas,
                    Student[] students) {
        this.title = title;
        this.professor = professor;
        this.headTA = headTA;
        this.tas = tas;
        this.students = students;

        int taleng = 0;
        if (tas.length <= 15) {
            taleng = tas.length;
        } else {
            taleng = 15;
        }

        TA[] taA = new TA[15];
        for (int i = 0; i < taleng; i++) {
            taA[i] = tas[i];
        }
        this.tas = taA;

        int stleng = 0;
        if (students.length <= 300) {
            stleng = students.length;
        } else {
            stleng = 300;
        }

        Student[] stA = new Student[300];
        for (int i = 0; i < stleng; i++) {
            stA[i] = students[i];
            this.numStudent++;
        }

    }

    /**
     * Accessor for Course.
     * @return title, course title, e.g ”CS 1331”
     */
    public String getTitle() {
        return title;
    }

    /**
     * Accessor for Course.
     * @return professor, the course’s professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * Accessor for Course.
     * @return headTA, the course's head TA
     */
    public TA getHeadTA() {
        return headTA;
    }

    /**
     * Accessor for Course.
     * @return tas, the array of course's TAs
     */
    public TA[] getTAs() {
        return tas;
    }

    /**
     * Accessor for Course.
     * @return students, the array of course's students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * Accessor for Course.
     * @return avgSP, the course's average study percentage
     */
    public double getAverageStudyPercentage() {
        double avgSP = 0.0;
        totalSP = 0.0;
        for (int i = 0; i < numStudent; i++) {
            totalSP = totalSP + students[i].getStudyPercentage();
        }
        avgSP = totalSP / numStudent;
        return avgSP;
    }

    /**
     * @param s should add students to the students array
     */
    public void addStudent(Student s) {
        if (numStudent < 300) {
            Student[] studentA = new Student[numStudent + 1];
            for (int i = 0; i < numStudent; i++) {
                studentA[i] = students[i];
            }
            studentA[numStudent] = s;
            students = studentA;
            numStudent++;
        }
    }

    /**
     * @param args what we take from the user's input
     */
    public static void main(String[] args) {

        TA[] tas = {
            new TA("Julie", "Yoon", "t1", 0.8, 0.8, 0.8),
            new TA("Harrison", "Won", "t2", 0.8, 0.8, 0.8)
        };

        Student[] students = {
            new Student("Tony", "Kim", "s1"),
            new Student("Kelly", "Yoo", "s2")
        };



        Professor professor = new Professor("Thomas", "Lee", "prof1", 1.0, 4.0);
        TA headta = new TA("Sunny", "Park", "h1", 0.9, 0.9, 0.9);

        Course course = new Course("CS 1331", professor, headta, tas, students);

        course.getStudents()[0].study(6);
        course.getStudents()[0].relax(4);
        course.getStudents()[1].study(8);
        course.getStudents()[1].relax(1);

        System.out.println("Course Title: " + course.getTitle() + "\n"
                            + "Professor: "
                            + course.getProfessor().getLastName() + ", "
                            + course.getProfessor().getFirstName() + "\n"
                            + "   - Funninness: "
                            + course.getProfessor().getFunnyFactor() + "\n"
                            + "   - Average GAP: "
                            + course.getProfessor().getGPA() + "\n"
                            + "Head TA: " + course.getHeadTA().getLastName()
                            + ", " + course.getHeadTA().getFirstName() + "\n"
                            + "   - Piazza Score: "
                            + course.getHeadTA().getPiazzaScore() + "\n"
                            + "   - Recitation Score: "
                            + course.getHeadTA().getRecitationScore() + "\n"
                            + "   - Office Hour Score: "
                            + course.getHeadTA().getOfficeHoursScore() + "\n"
                            + "TA1: " + course.getTAs()[0].getLastName()
                            + ", " + course.getTAs()[0].getFirstName() + "\n"
                            + "   - Piazza Score: "
                            + course.getTAs()[0].getPiazzaScore() + "\n"
                            + "   - Recitation Score: "
                            + course.getTAs()[0].getRecitationScore() + "\n"
                            + "   - Office Hour Score: "
                            + course.getTAs()[0].getOfficeHoursScore() + "\n"
                            + "TA2: " + course.getTAs()[1].getLastName()
                            + ", " + course.getTAs()[1].getFirstName() + "\n"
                            + "   - Piazza Score: "
                            + course.getTAs()[1].getPiazzaScore() + "\n"
                            + "   - Recitation Score: "
                            + course.getTAs()[1].getRecitationScore() + "\n"
                            + "   - Office Hour Score: "
                            + course.getTAs()[1].getOfficeHoursScore() + "\n"
                            + "Student1: "
                            + course.getStudents()[0].getLastName() + ", "
                            + course.getStudents()[0].getFirstName() + "\n"
                            + "   - Study Hours: "
                            + course.getStudents()[0].getStudyHours() + "\n"
                            + "   - Relax Hours: "
                            + course.getStudents()[0].getNonStudyHours() + "\n"
                            + "   - Study Percentage Hours: "
                            + course.getStudents()[0].getStudyPercentage()
                            + "\n"
                            + "Student2: "
                            + course.getStudents()[1].getLastName() + ", "
                            + course.getStudents()[1].getFirstName() + "\n"
                            + "   - Study Hours: "
                            + course.getStudents()[1].getStudyHours() + "\n"
                            + "   - Relax Hours: "
                            + course.getStudents()[1].getNonStudyHours() + "\n"
                            + "   - Study Percentage Hours: "
                            + course.getStudents()[1].getStudyPercentage());

        System.out.println("Course Study Percentage Average: "
                            + course.getAverageStudyPercentage());

        Student addSt = new Student("Victoria", "Kim", "s3");
        course.addStudent(addSt);
        course.getStudents()[2].study(7);
        course.getStudents()[2].relax(8);
        System.out.println("Student2: " + course.getStudents()[2].getLastName()
                            + ", " + course.getStudents()[2].getFirstName()
                            + "\n" + "   - Study Hours: "
                            + course.getStudents()[2].getStudyHours() + "\n"
                            + "   - Relax Hours: "
                            + course.getStudents()[2].getNonStudyHours() + "\n"
                            + "   - Study Percentage Hours: "
                            + course.getStudents()[2].getStudyPercentage());

        System.out.println("Course Study Percentage Average: "
                            + course.getAverageStudyPercentage());
    }
}
