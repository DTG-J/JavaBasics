package E2Checks;

import java.util.Scanner;

public class E2P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeA = Integer.parseInt(scanner.nextLine());
        int timeB = Integer.parseInt(scanner.nextLine());
        int timeC = Integer.parseInt(scanner.nextLine());
        int totalSecs = timeA + timeB + timeC;
        int minutes = totalSecs / 60;
        int seconds = totalSecs % 60;
        if (seconds < 10) {System.out.printf("%d:0%d" ,minutes, seconds );}
            else              {System.out.printf("%d:%d" , minutes, seconds);}

        }


    }

