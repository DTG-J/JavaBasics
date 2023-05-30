package E3ConditonalStatements;

import java.util.Scanner;

public class E3P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double shipPrice = 0;
        switch (season){
            case "Spring":
                if (fishermen <= 6) {
                    shipPrice = 2700;
                } else if (fishermen<=11) {
                    shipPrice = 2550;
                } else if (fishermen>12) {
                    shipPrice = 2250;
                }else {shipPrice = 3000;}
                if (fishermen % 2 == 0){
                    shipPrice = shipPrice * 0.95;
                }break;
            case "Summer":
                if (fishermen <= 6) {
                    shipPrice = 3780;
                } else if (fishermen<=11) {
                    shipPrice = 3570;
                } else if (fishermen>12) {
                    shipPrice = 3150;
                }else {shipPrice = 4200;}
                if (fishermen % 2 == 0){
                    shipPrice = shipPrice * 0.95;
                }break;
            case "Autumn":
                if (fishermen <= 6) {
                    shipPrice = 3780;
                } else if (fishermen<=11) {
                    shipPrice = 3570;
                } else if (fishermen>12) {
                    shipPrice = 3150;
                }else {shipPrice = 4200;}
                break;
            case "Winter":
                if (fishermen <= 6) {
                    shipPrice = 2340;
                } else if (fishermen<=11) {
                    shipPrice = 2210;
                } else if (fishermen>12) {
                    shipPrice = 1950;
                }else {shipPrice = 2600;}
                if (fishermen % 2 == 0){
                    shipPrice = shipPrice * 0.95;
                }break;

        }
        if (budget >= shipPrice){
        System.out.printf("Yes! You have %.2f leva left.", budget - shipPrice);}
        else {
            System.out.printf("Not enough money! You need %.2f leva.",
                    Math.abs(budget - shipPrice));
        }
    }
}
