import java.util.Scanner;
import java.io.PrintStream;
import java.io.File;

public class GpaCalc {

    private static double totalCredits = 0.0;
    private static double numberGrade = 0.0;
    private static double creditNumGrade = 0.0;
    private static double finalGPA = 0.0;
    private static String text = "";

    public static void main(String[] args) throws Exception {
        processInput();
    }

    private static void processCourse() throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the course title: ");
        String courseTitle = keyboard.nextLine();
        text += courseTitle + " - ";

        System.out.print("Enter the number of credits: ");
        double credits = keyboard.nextDouble();
        if (credits < 1 || credits > 4) {
            System.out.println("Please enter a value between 1 and 4");
            System.exit(0);
        }

        totalCredits += credits;
        text += " " + credits + ". ";

        System.out.print("Enter the grade (A=4, B=3, etc) ");
        numberGrade = keyboard.nextDouble();

        if (numberGrade < 0 || numberGrade > 4) {
            System.out.println("Please enter a value between 0 and 4");
            System.exit(0);
        }
        creditNumGrade += credits * numberGrade;
        text += "Grade: " + numberGrade + "\n";

    }

    public static void processInput() throws Exception {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the semester: ");
        String semester = keyboard.nextLine();
        String semesterName = semester.toLowerCase();
        semesterName = semesterName.replaceAll("\\s+", "");

        PrintStream outFile = new PrintStream(new File(semesterName + ".txt"));
        processCourse();

        String anotherCourse = "y";

        while (anotherCourse.equalsIgnoreCase("y")) {
            System.out.print("Would you like to enter another course? (y/n) ");
            anotherCourse = keyboard.next();

            if (anotherCourse.equalsIgnoreCase("y")) {
                processCourse();
            }

            if (anotherCourse.equalsIgnoreCase("n")) {
                finalGPA = creditNumGrade / totalCredits;
                System.out.printf("Overall GPA: %.2f", finalGPA);
                System.out.println("");
                text += "GPA: " + finalGPA;
                System.out.print("Would you like to calcaulate"
                    + "for another semester? (y/n) ");
                String anotherSemester = keyboard.next();
                outFile.println(text);

                if (anotherSemester.equalsIgnoreCase("y")) {
                    text = "";
                    totalCredits = 0.0;
                    numberGrade = 0.0;
                    creditNumGrade = 0.0;
                    finalGPA = 0.0;
                    processInput();

                } else if (anotherSemester.equalsIgnoreCase("n")) {
                    System.exit(0);
                }

            }

        }

    }

}
