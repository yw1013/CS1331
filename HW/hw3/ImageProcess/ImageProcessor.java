public class ImageProcessor {
    private static Pic original;

    public ImageProcessor(Pic clean) {
        original = clean;
    }

    public Pic greyscale() {
        Pic greyImage = original.deepCopy();
        Pixel [][] pixels = greyImage.getPixels();

        for (int i = 0; i < greyImage.getHeight(); i++) {
            for (int j = 0; j < greyImage.getWidth(); j++) {
                int red = pixels[i][j].getRed();
                int green = pixels[i][j].getGreen();
                int blue = pixels[i][j].getBlue();

                int average = (red + green + blue) / 3;

                pixels[i][j].setRed(average);
                pixels[i][j].setGreen(average);
                pixels[i][j].setBlue(average);
            }
        }

        return greyImage;
    }

    public Pic invert() {
        Pic invertedImage = original.deepCopy();
        Pixel [][] pixels = invertedImage.getPixels();

        for (int i = 0; i < invertedImage.getHeight(); i++) {
            for (int j = 0; j < invertedImage.getWidth(); j++) {
                int red = pixels[i][j].getRed();
                int green = pixels[i][j].getGreen();
                int blue = pixels[i][j].getBlue();
                int maxValue = 255;

                red = maxValue - red;
                green = maxValue - green;
                blue = maxValue - blue;

                pixels[i][j].setRed(red);
                pixels[i][j].setGreen(green);
                pixels[i][j].setBlue(blue);
            }
        }

        return invertedImage;
    }

    public Pic noRed() {
        Pic noRedImage = original.deepCopy();
        Pixel [][] pixels = noRedImage.getPixels();

        for (int i = 0; i < noRedImage.getHeight(); i++) {
            for (int j = 0; j < noRedImage.getWidth(); j++) {
                int green = pixels[i][j].getGreen();
                int blue = pixels[i][j].getBlue();

                pixels[i][j].setRed(0);
                pixels[i][j].setGreen(green);
                pixels[i][j].setBlue(blue);
            }
        }

        return noRedImage;
    }

    public Pic blackAndWhite() {
        Pic noRedImage = original.deepCopy();
        Pixel [][] pixels = noRedImage.getPixels();

        for (int i = 0; i < noRedImage.getHeight(); i++) {
            for (int j = 0; j < noRedImage.getWidth(); j++) {
                int red = pixels[i][j].getRed();
                int green = pixels[i][j].getGreen();
                int blue = pixels[i][j].getBlue();

                int average = (red + green + blue) / 3;

                if (average > 127) {
                    pixels[i][j].setRed(255);
                    pixels[i][j].setGreen(255);
                    pixels[i][j].setBlue(255);
                } else {
                    pixels[i][j].setRed(0);
                    pixels[i][j].setGreen(0);
                    pixels[i][j].setBlue(0);
                }
            }
        }

        return noRedImage;
    }

    public Pic maximize() { 
        Pic maximizedImage = original.deepCopy();
        Pixel [][] pixels = maximizedImage.getPixels();

        for (int i = 0; i < maximizedImage.getHeight(); i++) {
            for (int j = 0; j < maximizedImage.getWidth(); j++) {
                int red = pixels[i][j].getRed();
                int green = pixels[i][j].getGreen();
                int blue = pixels[i][j].getBlue();

                if (red > green && red > blue) {
                    pixels[i][j].setGreen(0);
                    pixels[i][j].setBlue(0);
                } else if (green > red && green > blue) {
                    pixels[i][j].setRed(0);
                    pixels[i][j].setBlue(0);
                } else if (blue > red && blue > green) {
                    pixels[i][j].setRed(0);
                    pixels[i][j].setGreen(0);
                } else if (red == green && red > blue) {
                    pixels[i][j].setBlue(0);
                } else if (green == blue && green > red) {
                    pixels[i][j].setRed(0);
                } else if (blue == red && blue > green) {
                    pixels[i][j].setGreen(0);
                }
            }
        }

        return maximizedImage;
    }

    public Pic overlay(Pic other) {
        Pic overlay = original.deepCopy();
        Pixel [][] pixels = overlay.getPixels();
        Pixel [][] overlayPix = other.getPixels();

        int height = Math.min(overlay.getHeight(), other.getHeight());
        int width = Math.min(overlay.getWidth(), other.getWidth());

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                pixels[i][j].setRed((pixels[i][j].getRed()
                    + overlayPix[i][j].getRed()) / 2);

                pixels[i][j].setGreen((pixels[i][j].getGreen()
                    + overlayPix[i][j].getGreen()) / 2);

                pixels[i][j].setBlue((pixels[i][j].getBlue()
                    + overlayPix[i][j].getBlue()) / 2);
            }
        }

        return overlay;
    }

    public static void main(String[] args) {
        Pic original = new Pic(args[0]);
        ImageProcessor ip = new ImageProcessor(original);

        ip.greyscale().show();
        ip.invert().show();
        ip.noRed().show();
        ip.blackAndWhite().show();
        ip.maximize().show();

        if (args.length == 2) {
            Pic overlayPic = new Pic(args[1]);
            ip.overlay(overlayPic).show();
        }
    }
}
