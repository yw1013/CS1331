import java.util.Arrays;

public class HowToPass {

    private int[] exams;
    private double examAverage;
    private int[] timedLabs;
    private double timedLabAverage;
    private int[] homeworks;
    private double homeworkAverage;
    private int percentRemaining;
    private double currentAverage;


    public HowToPass(String currentScores) {
        exams = extractScores("Exams", currentScores);
        examAverage = average(exams);

        homeworks = extractScores("Homeworks", currentScores);
        homeworkAverage = average(homeworks);

        timedLabs = extractScores("Timed Labs", currentScores);
        timedLabAverage = average(timedLabs);

        percentRemaining = 100
            - (exams.length * 15)
            - (homeworks.length * 2)
            - (timedLabs.length * 5)
            - 20;

        currentAverage =
            examAverage * (45.0 / 80)
            + timedLabAverage * (15.0 / 80)
            + homeworkAverage * (20.0 / 80);
    }

    String report() {
        String report = "Given your current scores:" + System.lineSeparator()
            + "Exams: " + Arrays.toString(exams) + System.lineSeparator()
            + "TLs:   " + Arrays.toString(timedLabs) + System.lineSeparator()
            + "HWs:   " + Arrays.toString(homeworks) + System.lineSeparator()
            + String.format("and current average of %4.1f%n",
                            currentAverage)
            + String.format("On remaining assignments you need:%n");

        for (int desired: Arrays.asList(90, 80, 70, 60)) {
            report += String.format("a %4.1f average to finish with a %d.%n",
                requiredRemaining(currentAverage, desired, percentRemaining),
                desired);
        }
        return report;
    }

    double requiredRemaining(double current,
                             double desired,
                             int pctRemaining) {
        double remaining = pctRemaining / 100.0;
        return (desired - ((1 - remaining) * current))
               / remaining;
    }

    // Don't touch anything above this line.
    // Finish implementing all the remaining methods below this line.
    // Don't modify the method signatures.
    // Methods have dummy return values so code compiles.  Modify as necessary.

    static double average(int ... nums) {
        // Your code here
        // for (int i=0; i <= nums.length; i++) {
        //     nums = nums + nums;
        //     }
        // return nums/nums.length;
        double a = (10+15)/20;
        return a;
    }


    int[] extractScores(String label, String currentScores) {
        // Your code here
        // int[] es = new int [extractScores.length];
        // for (int i=0; i < es.length; i++)
        //     if (i == args[0]) {
        //         es += args[1];
        //     }
        // return es;
        return null;
    }

    String extractClause(String label, String text) {
        // Your code here
        return null;
    }

    public static void main(String ... args) {
        // Your code here
        System.out.println("a");
    }
}
