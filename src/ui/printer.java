package ui;

import model.flag;

public class printer {
	private static String yellow = "\033[43m";
	private static  String blue= "\033[44m";
	private static  String red = "\033[41m";
	private static String end= "\u001b[";
	private static  String reb = "\033[0m";
    private final flag bFlag;
    private String temp;
    private int temp2;
    private boolean temp3;
    
    public printer(flag cFlag) {
        bFlag = cFlag;
    }
    
    
    /*
    public void showAllInfo(int seconds, int position) {
        int x = 0;
        while (x < 120) {
            System.out.print(flag.getColor()
            System.out.print(ESC
            System.out.print(x+"G"+ESC+position+"d");
            
            for (int i = 0; i < flag.getWidth(); i++){
                stop(seconds);
                System.out.print(flag.getColor()+ESC+x+"G"+ESC + (position + i) + "d" + " ");
            }
            }
        }
    } */
    
    public void stop(long rate) {
        try {
            Thread.sleep(rate);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
    
    public void show(int timer, int latitude) {
        int x = 0;
        while (x < 120) {
            System.out.print(flag.getColor()+end+x+"G"+end+latitude+"d");
            for (int i = 0; i < flag.getWidth(); i++){
                stop(timer);
                System.out.print(flag.getColor()+end+x+"G"+end + (latitude + i) + "d" + " ");
            }
            x++;
        }
    }
}

