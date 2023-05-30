package E3ConditonalStatements;

import java.util.Scanner;

public class E3P3NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double cost = 0;

        switch (flowersType) {
            case "Roses":
                cost = numFlowers * 5;
                if (numFlowers > 80) {
                    cost = cost * 0.9;
                }
                break;
            case "Dahlias":
                cost = numFlowers * 3.80;
                if (numFlowers > 90) {
                    cost = cost * 0.85;
                }
                break;
            case "Tulips":
                cost = numFlowers * 2.80;
                if (numFlowers > 80) {
                    cost = cost * 0.85;
                }
                break;
            case "Narcissus":
                cost = numFlowers * 3;
                if (numFlowers < 120) {
                    cost = cost * 1.15;
                }
                break;
            case "Gladiolus":
                cost = numFlowers * 2.50;
                if (numFlowers < 80) {
                    cost = cost * 1.20;
                }
                break;
        }
        double diff = Math.abs(budget - cost);
         if (budget >= cost) {
 System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flowersType, diff);
        } else {
             System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}


