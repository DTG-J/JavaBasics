package Exam01;

import java.util.Scanner;

public class P04Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ballsNum = Integer.parseInt(scanner.nextLine());

        int points = 0;
       /* int allballs = 0;*/

        int reds = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int others = 0;
/*while (allballs <= ballsNum)*/
        for (int i = 1; i <= ballsNum; i++) {
            String ballColor = scanner.nextLine();


            if (ballColor.equals("red")){
                points = points + 5;
                reds++;
            } else if (ballColor.equals("orange")){
                points = points + 10;
                orange++;
            }else if (ballColor.equals("yellow")) {
                points = points + 15;
                yellow++;
            }else if (ballColor.equals("white")) {
                points = points + 20;
                white++;
            }else if (ballColor.equals("black")) {
                points = (points / 2);
                black++;
            }else {
                /*allballs ++;*/
                others++;
               /* continue;*/
            }
            /*ballColor = scanner.nextLine();*/
            /*allballs ++;*/

        }
        System.out.println("Total points: " + points);
        System.out.println("Red balls: " + reds);
        System.out.println("Orange balls: " + orange);
        System.out.println("Yellow balls: " + yellow);
        System.out.println("White balls: " + white);
        System.out.println("Other colors picked: " + others);
        System.out.println("Divides from black balls: " + black);

    }
}
