package ui;
import model.flag;
import threads.flagThread;

public class main {
	
	 static String Yellow = "\033[43m";
	 static  String Blue= "\033[44m";
	 static  String Red = "\033[41m";
	 static String end= "\u001b[";
	static  String reb = "\033[0m";
     String temp;
     int temp2;
     boolean temp3;
	
	 public static void main(String[] args) throws InterruptedException{
	        start();
	        initialize();
	        System.out.println(reb + "\n");
	    }

	   
	    public static void initialize() throws InterruptedException {
	        flag yellow = new flag(Yellow, 10);
	        printer pY = new printer(yellow);
	        flagThread tYellow = new flagThread(pY, 20, 0);
	        tYellow.start();
	        tYellow.join();
	        flag blue = new flag(Blue, 4);
	        printer pB = new printer(blue);
	        flagThread tBlue = new flagThread(pB, 80, 10);
	        tBlue.start();
	        tBlue.join();
	        flag red = new flag(Red, 4);
	        printer pR = new printer(red);
	        flagThread tRed = new flagThread(pR, 120, 14);
	        tRed.start();
	        tRed.join();
	       
	       
	       
	       
	       

	    }
	    
	    public static void start() {
	        System.out.print(end+"0G"+end+"0d");
	        System.out.print(end+"2J");
	    }

	}

