/* Put your Pixel class here */
/**
 * This class represents pixel of an image.
 * @author Yea Won Yoon
 * @version 1.0
 */
public class Pixel {
    private int red;
    private int green;
    private int blue;
    private int alpha;

    /**
     * The constructor for Pixel takes RGBA.
     * It sets up the private instance data for later.
     * @param red   the red component of the pixel
     * @param green the green component of the pixel
     * @param blue  the blue component of the pixel
     * @param alpha the alpha component of the pixel
     */
    public Pixel(int red, int green, int blue, int alpha) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    /**
     * Gets the red component of this pixel.
     * @return The red component as an int from 0-255.
     */
    public int getRed() {
        return red;
    }

    /**
     * Gets the green component of this pixel.
     * @return The green component as an int from 0-255.
     */
    public int getGreen() {
        return green;
    }

    /**
     * Gets the blue component of this pixel.
     * @return The blue component as an int from 0-255.
     */
    public int getBlue() {
        return blue;
    }

    /**
     * Gets the alpha component of this pixel.
     * @return The alpha component as an int from 0-255.
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * Determines if an input is valid.
     * @param num the value of the pixel
     * @return true if the input is between 0 and 255
     */
    private boolean isValid(int num) {
        return num < 256 && num > -1;
    }

    /**
     * Sets the red component of this pixel only if parameter is a valid input.
     * @param red the red component as an int from 0-255
     */
    public void setRed(int red) {
        if (isValid(red)) {
            this.red = red;
        }
    }

    /**
     * Sets the green component of this pixel only if parameter is a valid input
     * @param green the green component as an int from 0-255
     */
    public void setGreen(int green) {
        if (isValid(green)) {
            this.green = green;
        }
    }

    /**
     * Sets the blue component of this pixel only if parameter is a valid input.
     * @param blue the blue component as an int from 0-255
     */
    public void setBlue(int blue) {
        if (isValid(blue)) {
            this.blue = blue;
        }
    }

    /**
     * Sets the alpha component of this pixel only if parameter is a valid input
     * @param alpha the alpha component as an int from 0-255
     */
    public void setAlpha(int alpha) {
        if (isValid(alpha)) {
            this.alpha = alpha;
        }
    }
}
