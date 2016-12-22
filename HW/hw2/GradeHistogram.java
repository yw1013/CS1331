import java.util.Scanner;import java.io.File;public class GradeHistogram {    public static void main(String[] args) throws Exception {        Scanner file = new Scanner(new File(args[0]));        System.out.println("Grades loaded!");        int bucketNum = 0;        if (args.length < 2) {            Scanner bn = new Scanner(System.in);            System.out.println("What bucket size would you like?");            System.out.print(">>> ");            bucketNum = bn.nextInt();        } else {            bucketNum = Integer.parseInt(args[1]);        }        double binNum =  Math.ceil((double) 101 / bucketNum);        int binNumInt = (int) binNum;        String[] answer = new String[binNumInt];        for (int left = 100, a = 0; left >= 0; a++) {            if ((left - bucketNum) < 0) {                answer[a] = String.format("%3d -  0 | ", left);                break;            } else {                int right = left - bucketNum + 1;                answer[a] = String.format("%3d -%3d | ", left, right);                left = left - bucketNum;            }        }        while (file.hasNextLine()) {            String line = file.nextLine();            String[] graph = line.split(", ");            int number = Integer.parseInt(graph[1]);            int finalNum = number + bucketNum * (binNumInt - 1) - 100;            double where = Math.ceil((double) finalNum / bucketNum);            int belongs = binNumInt - (int) where - 1;            answer[belongs] += "[]";        }        System.out.println("");        for (int i = 0; i < binNumInt; i++) {            System.out.println(answer[i]);        }        System.out.println("");    }}