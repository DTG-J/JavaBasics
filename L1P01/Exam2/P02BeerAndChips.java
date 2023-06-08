package Exam2;

import java.util.Scanner;

public class P02BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String footballFanName = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beerBottles = Integer.parseInt(scanner.nextLine());
        int chipsPackages = Integer.parseInt(scanner.nextLine());



        double beerPrice = beerBottles * 1.20;
        double chipPrice = beerPrice * 0.45;
        double totalChips = Math.ceil(chipPrice * chipsPackages);
        double total = beerPrice + totalChips;


        double diff = Math.abs(total - budget);
        if (total<=budget){
            System.out.printf("%s bought a snack and has %.2f leva left.", footballFanName, diff);
        }else {
            System.out.printf("%s needs %.2f more leva!", footballFanName,diff);
        }


    }
}
