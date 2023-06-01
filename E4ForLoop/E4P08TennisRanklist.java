package E4ForLoop;


import java.util.Scanner;

public class E4P08TennisRanklist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int tournamentsNumber = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int countWins = 0;
        int racePoints = 0;

        for (int i = 1; i <= tournamentsNumber; i++) {

            String tournamentsType = scanner.nextLine();

            if (tournamentsType.equals("W")) {
                countWins++;
                racePoints += 2000;
            } else if(tournamentsType.equals("F")) {
                racePoints += 1200;

            } else if (tournamentsType.equals("SF")) {
                racePoints += 720;

            }


        }
        double percentageWins = (countWins * 1.0 / tournamentsNumber) * 100;
        int finalPoint = racePoints + startingPoints;
        int averagePoints = racePoints / tournamentsNumber;

        System.out.printf("Final points: %d%n ", finalPoint);
        System.out.printf("Average points: %d%n ", averagePoints);
        System.out.printf("%.2f%%%n", percentageWins);

    }
}
