import java.util.Scanner;
import java.util.*;

public class GpaCalc{
    private static double creditGrade = 0;
    private static double totalCredits = 0;
    private static double finalGPA =0;

    public static void main(String[] args) throws Exception {
        processInput();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Would you like to calculate for another semester? (y/n)");
        String anotherSemester = keyboard.next();
        while(anotherSemester.equals("y")){
            totalCredits = 0;
            creditGrade = 0;
            processInput();
            System.out.println("Would you like to calculate for another semester? (y/n)");
            anotherSemester = keyboard.next();
        }

    }
    public static void processInput() throws Exception{
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the semester: ");
        String semester = in.nextLine();

        System.out.println("Enter the course title: ");
        String course = in.nextLine();

        System.out.println("Enter the number of credits: ");
        int credits = in.nextInt();
        totalCredits = totalCredits + credits;

        System.out.println("Enter the grade (A=4, B=3, C=2, D=1, F=0): ");
        int grade = in.nextInt();
        creditGrade = creditGrade + (credits * grade);

        System.out.println("Would you like to enter another course? (y/n) ");
        String anotherCourse = in.next();
        while(anotherCourse.equals("y")){
            System.out.println("Enter the course title: ");
            course = in.next();

            System.out.println("Enter the number of credits: ");
            credits = in.nextInt();
            totalCredits = totalCredits + credits;

            System.out.println("Enter the grade (A=4, B=3, C=2, D=1, F=0): ");
            grade = in.nextInt();
            creditGrade = creditGrade + (credits * grade);

            System.out.println("Would you like to enter another course? (y/n) ");
            anotherCourse = in.next();
        }
        if(anotherCourse.equals("n")){
            finalGPA = creditGrade/totalCredits;
            System.out.printf("Overall GPA: %.2f. \n", finalGPA);

        }
    }
}
