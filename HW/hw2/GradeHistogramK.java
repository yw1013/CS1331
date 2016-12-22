import java.util.Scanner;
import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;

public class GradeHistogramK {
    public static void main(String[] args) throws Exception {
        System.out.println("Grades loaded!");
        int binsize;
        if (args.length < 2) {
            System.out.println("What bucket size would you like?");
            System.out.print(">>> ");
            Scanner scan = new Scanner(System.in);
            String temp = scan.nextLine();
            binsize = Integer.parseInt(temp);
        } else {
            binsize = Integer.parseInt(args[1]);
        }

        double tempp = Math.ceil((double) 101 / binsize);
        int binNumber = (int) tempp;
        String[] arr = new String[binNumber];
        for (int i = 100, j = 0; i > 0; j++) {
            int t = i - binsize + 1;
            arr[j] = String.format("%3d - %3d | ", i, t);
            i = i - binsize;
        }
        int m = 100 - binsize * binNumber + binsize;
        int z = 0;
        arr[binNumber - 1] = String.format("%3d - %3d | ", m, z);

        Scanner filename = new Scanner(new File(args[0]));
        filename.useDelimiter(", ");
        String trash = filename.next(); //leading empty string
        while (filename.hasNext()) {
            String data = filename.next();
            data = data.replaceAll("\\D+", "");
            int grades = Integer.parseInt(data);
            int gra = grades - m;
            double whichbin = Math.ceil((double) gra / binsize);
            int whichBin = (int) whichbin;
            int bin = binNumber - whichBin;
            arr[bin - 1] += "[]";
        }
        System.out.println("");
        for (int l = 0; l < binNumber; l++) {
            System.out.println(arr[l]);
        }
    }
}
