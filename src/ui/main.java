package ui;
import model.flag;
import threads.flagThread;

public class main {
	
	private static String Yellow = "\033[43m";
	private static  String Blue= "\033[44m";
	private static  String Red = "\033[41m";
	private static String end= "\u001b[";
	private static  String reb = "\033[0m";
    private String temp;
    private int temp2;
    private boolean temp3;
	
	 public static void Main(String[] args) throws InterruptedException {
	        start();
	        initialize();
	        System.out.println(reb + "\n");
	    }

	   
	    public static void initialize() throws InterruptedException {
	        flag yellow = new flag(Yellow, 10);
	        flag blue = new flag(Blue, 4);
	        flag red = new flag(Red, 4);
	        printer pY = new printer(yellow);
	        printer pB = new printer(blue);
	        printer pR = new printer(red);

	        flagThread tYellow = new flagThread(pY, 8, 0);
	        flagThread tBlue = new flagThread(pB, 45, 10);
	        flagThread tRed = new flagThread(pR, 80, 14);

	        tYellow.start();
	        tBlue.start();
	        tRed.start();

	        tYellow.join();
	        tBlue.join();
	        tRed.join();

	    }
	    
	    public static void start() {
	        System.out.print(end+"0G"+end+"0d");
	        System.out.print(end+"2J");
	    }

	}

