/* Put your ImageProcessor class here */
/**
 * This class represents a processor for a specific picure.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class ImageProcessor {
    private static Pic original;

    /**
     * Constructor for ImageProcessor.
     * @param clean input picture value
     */
    public ImageProcessor(Pic clean) {
        opic = clean;
    }

    /**
     * @param increment value used to modify picture.
     * @return the Pic value of the picture.
     */
    public Pic add(int increment) {
        Pic aI = opic.deepCopy();
        Pixel [][] pixels = aI.getPixels();

        for (int i = 0; i < aI.getHeight(); i++) {
            for (int j = 0; j < aI.getWidth(); j++) {

                int red = pixels[i][j].getRed();
                pixels[i][j].setRed(red + increment);

                int green = pixels[i][j].getGreen();
                pixels[i][j].setGreen(green + increment);

                int blue = pixels[i][j].getBlue();
                pixels[i][j].setBlue(blue + increment);
            }
        }
        return aI;
    }

    /**
     * @param scale value used to scale the pixel value
     * @return the Pic value of the picture.
     */
    public Pic multiply(double scale) {
        Pic mI = opic.deepCopy();
        Pixel [][] pixels = mI.getPixels();

        for (int i = 0; i < mI.getHeight(); i++) {
            for (int j = 0; j < mI.getWidth(); j++) {

                int red = pixels[i][j].getRed();
                double rScale = red * scale;
                pixels[i][j].setRed((int) rScale);

                int green = pixels[i][j].getGreen();
                double gScale = green * scale;
                pixels[i][j].setGreen((int) gScale);

                int blue = pixels[i][j].getBlue();
                double bScale = blue * scale;
                pixels[i][j].setBlue((int) bScale);
            }
        }
        return mI;
    }

    /**
     * @param key value used to modify picture.
     * @param dr delta red value used to modify picture.
     * @param dg delta green value used to modify picture.
     * @param db delta blue value used use to modify picture.
     * @return the Pic value of the picture.
     */
    public Pic chroma(Pixel key, int dr, int dg, int db) {
        Pic cI = opic.deepCopy();
        Pixel [][] pixels = cI.getPixels();

        for (int i = 0; i < cI.getHeight(); i++) {
            for (int j = 0; j < cI.getWidth(); j++) {
                int red = pixels[i][j].getRed();
                int green = pixels[i][j].getGreen();
                int blue = pixels[i][j].getBlue();

                int absr = Math.abs(red - key.getRed());
                int absg = Math.abs(green - key.getGreen());
                int absb = Math.abs(blue - key.getBlue());

                if ((absr < dr) && (absg < dg) && (absb < db)) {
                    pixels[i][j].setAlpha(0);
                }
            }
        }
        return cI;
    }

    /**
     * @param bg Pic value used to modify picture.
     * @return Pic value of the picture.
     */
    public Pic background(Pic bg) {
        Pic bI = opic.deepCopy();
        Pixel [][] pixels = bI.getPixels();
        Pixel [][] pixels2 = bg.getPixels();


        for (int i = 0; i < bg.getHeight(); i++) {
            for (int j = 0; j < bg.getWidth(); j++) {
                int red = pixels[i][j].getRed();
                int green = pixels[i][j].getGreen();
                int blue = pixels[i][j].getBlue();
                int alpha = pixels[i][j].getAlpha();

                int rbg = pixels2[i][j].getRed();
                int gbg = pixels2[i][j].getGreen();
                int bbg = pixels2[i][j].getBlue();
                int abg = pixels2[i][j].getAlpha();

                if (alpha == 0) {
                    pixels[i][j].setRed(rbg);
                    pixels[i][j].setGreen(gbg);
                    pixels[i][j].setBlue(bbg);
                    pixels[i][j].setAlpha(abg);
                }

            }
        }
        return bI;
    }
}
