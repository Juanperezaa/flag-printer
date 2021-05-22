package model;

public class flag {

    private static String color;
    private static int width;
   

    public flag(String colorP, int widthP) {
        color = colorP;
        width = widthP;
    }

    public static String getColor() {
        return color;
    }

    public static int getWidth() {
        return width;
    }
}