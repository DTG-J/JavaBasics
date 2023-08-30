package Exam01;

import java.util.Scanner;

public class P06EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCake = Integer.parseInt(scanner.nextLine());

        int maxPoint = Integer.MIN_VALUE;
        String winnerName = "";               ;
        for (int i = 1; i <= easterCake; i++) {
            String name = scanner.nextLine();

            int totalPoints = 0;
            String input = scanner.nextLine();
            while (!input.equals("Stop")){
            int points = Integer.parseInt(input);
            totalPoints += points;
            input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", name, totalPoints);


            if (totalPoints>maxPoint){
                maxPoint=totalPoints;
                winnerName = name;
                System.out.printf("%s is the new number 1!%n", name);
            }
        }
        System.out.printf("%s won competition with %d points!%n", winnerName, maxPoint);

    }
}
