package Exam01;

import java.util.Scanner;

public class P04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double targetProfit = Double.parseDouble(scanner.nextLine());
        String cocktailName = scanner.nextLine();

        double totalFinalPrice = 0;
        double price = 0;
        while (!cocktailName.equals("Party!")){

            int numberOfCocktails = Integer.parseInt(scanner.nextLine());
            int cocktailPrice = cocktailName.length();
            int cocktailFinalPrice = cocktailPrice * numberOfCocktails;
            if (cocktailFinalPrice % 2 ==0){
                 price = cocktailFinalPrice;
                 totalFinalPrice+=price;
            }else {
                price = cocktailFinalPrice * 0.75;
                totalFinalPrice+=price;
            }
            if (totalFinalPrice >= targetProfit){
                break;
            }

            cocktailName = scanner.nextLine();


        }
        double diff = Math.abs(totalFinalPrice - targetProfit);
        if (cocktailName.equals("Party!")) {
            System.out.printf("We need %.2f leva more.%n", diff);
            System.out.printf("Club income - %.2f leva.%n", totalFinalPrice);
        } else if (totalFinalPrice >= targetProfit) {
            System.out.printf("Target acquired.%n");
            System.out.printf("Club income - %.2f leva.%n", totalFinalPrice);

        }
    }
}
