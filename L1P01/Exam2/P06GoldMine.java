package Exam2;

import java.util.Scanner;

public class P06GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locationsNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= locationsNumber; i++) {
            double expectedGoldExtraction = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());

            int averageExtraction = 0;
            for (int j = 1; j <=days ; j++) {
                int goldDigged = Integer.parseInt(scanner.nextLine());
                averageExtraction += goldDigged;

            }
            double finalExtraction = averageExtraction * 1.0 / days;
            if (finalExtraction >=expectedGoldExtraction){
                System.out.printf("Good job! Average gold per day: %.2f.%n",finalExtraction);
            }else {
                double diff = Math.abs(finalExtraction - expectedGoldExtraction);
                System.out.printf("You need %.2f gold.%n", diff);
            }

        }
    }
}
