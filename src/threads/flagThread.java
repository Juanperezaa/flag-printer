package threads;


import ui.printer;

public class flagThread extends Thread {
	private static String Yellow = "\033[43m";
	private static  String Blue = "\033[44m";
    private static String Red = "\033[41m";
    private static  String end = "\u001b[";
    private static String reb = "\033[0m";
    private final printer printer;
    private final int timer;
    private final int latitude;
    private String temp;
    private int temp2;
    private boolean temp3;

    public flagThread(printer p, int t, int l) {
        printer = p;
        timer = t;
        latitude = l;
    }

    @Override
    public void run() {
        printer.show(timer, latitude);
    }
}
