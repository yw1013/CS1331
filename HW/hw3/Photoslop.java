import java.io.IOException;
/**
 * This class represents a skeleton code for running and testing the code.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Photoslop {

    /**
     * @param args what we take from the user's input
     */
    public static void main(String... args) throws IOException {
        if (args.length < 4) {
            printUsage();
            System.exit(0);
        }
        try {
            //your code here
            //hint the base pic for use with the image processor is in args[1]
            Pic pic = new Pic(args[1]);
            ImageProcessor ip = new ImageProcessor(pic);

            if (args[0].equals("-a")) {
                //add mode
                //your code here
                //add args[2] to the picture, then call
                //Save to args[3]
                Pic aPic = ip.add(Integer.parseInt(args[2]));
                aPic.save(args[3]);

            } else if (args[0].equals("-m")) {
                //same as add, but multiply
                Pic mPic = ip.multiply(Double.parseDouble(args[2]));
                mPic.save(args[3]);

            } else if (args[0].equals("-c")) {
                //use this as your chroma key to match the greenscreen
                //in the lego guy image
                Pixel chromaKey = new Pixel(26, 185, 19, 1);

                Pic cPic = ip.chroma(chromaKey, 20, 40, 20);
                Pic p2 = new Pic(args[2]);
                Pic bPic = ip.background(p2);
                bPic.save(args[3]);

                //Your code here to apply the chroma key transformation
                //It's up to you what you want the rgb deltas (thresholds) to be
                //I used something like 20, 40, 20

                //Hint: to do this part, consider making another ImageProcessor
                //Your code here to apply the background (args[2])

                //Finally, save to args[3]


            } else {
                printUsage();
            }
        } catch (IOException ex) {
            System.out.println("One of the files you referenced does not exist,"
                + " or is corrupted. Double-check and try again.");
        }
    }

    private static void printUsage() {
        System.out.println("Add mode: ");
        System.out.println("java -a imageFile n outputFile");
        System.out.println("");
        System.out.println("Multiply mode: ");
        System.out.println("java -m imageFile n outputFile");
        System.out.println("");
        System.out.println("Greenscreen mode: ");
        System.out.println("java -c imageFile backgroundFile outputFile");
    }
}
