import java.util.Scanner;
import java.io.File;

public class GradeHistogram {
    public static void main(String[] args) throws Exception {
        File dataFile = new File("grades.csv");
        Scanner fileReader = new Scanner(dataFile);

        int[] gradeFrequency = new int[101];
        for (int j = 0; j < 101; j++) {
            gradeFrequency[j] = 0;
        }
        while (fileReader.hasNextLine()) {
            String str = fileReader.nextLine();
            String delims = "[,]";
            String second = str.split(delims)[1].split(" ")[1];
            int grade = Integer.parseInt(second);
            gradeFrequency[grade]++;
        }
        Scanner output = new Scanner(System.in);

        System.out.println("Grades loaded!");
        System.out.println("What bucket size would you like?");
        int size = output.nextInt();
        double a = (double) size;
        System.out.println();
        double b = (double) Math.ceil(101 / a);
        int lineLength = (int) b;
        int upper = 100;
        int lower = 100 - size + 1;

        String[] lineCount = new String[lineLength];
        
        for (int i = 0; i < lineCount.length; i++) {
            lineCount[i] = new String(upper + " - " + lower + " | ");
            String align = "%12s";
            System.out.printf(align, lineCount[i]);

            for (int j = lower; j <= upper && j >= lower; j++) {
                for (int k = 0; k < gradeFrequency[j]; k++) {
                    System.out.print("[]");

                }
            }
            upper = upper - size;
            if (upper > 0) {
                lower = upper - size + 1;
            } else {
                lower = 0;
            }
            System.out.println();
        }



    }

}
