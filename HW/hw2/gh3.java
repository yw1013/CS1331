import java.util.Scanner;
import java.io.File;

public class GradeHistogram {
    public static void main(String[] args) throws Exception {

        Scanner file = new Scanner(new File(args[0]));

        System.out.println("Grades loaded!");

        int bucketNum = 0;
        if (args.length < 2) {
            Scanner bn = new Scanner(System.in);
            System.out.println("What bucket size would you like?");
            System.out.print(">>> ");
            bucketNum = bn.nextInt();
        } else {
            bucketNum = Integer.parseInt(args[1]);
        }

        double binNum = Math.ceil((double) 101 / bucketNum);
        int binNumInt = (int) binNum;

        String[] answer = new String[binNumInt];
        int[] numGrade = new int[101];

        for (int i = 0 ; i < numGrade.length; i++) {
            numGrade[i] = 0;
        }

        while (file.hasNextLine()) {
        String line = file.nextLine();
        String[] graph = line.split(", ");
        int number = Integer.parseInt(graph[1]);
        numGrade[number] += 1;
    // double where = Math.ceil((double) number / bucketNum);
    // int belongs = binNumInt - (int) where;
    // answer[belongs - 1] += "[]";
        }
        int r = 0;
        int l = 0;
        for (int left = 100, a = 0; left >= 0; a++) {
            if ((left - bucketNum) < 0) {
                answer[a] = String.format("%3d -  0 | ", left);
                break;
            } else {
                int right = left - bucketNum + 1;
                answer[a] = String.format("%3d -%3d | ", left, right);
                left = left - bucketNum;
                r = right;
                l = left;
            }

            for (int j = r; j <= l && j >= r; j++) {
                for (int k = 0; k < numGrade[j]; k++) {
                    System.out.print("[]");
                }
            }
        }

        System.out.println("");
        for (int i = 0; i < binNumInt; i++) {
            System.out.println(answer[i]);
        }
        System.out.println("");
    }
}
