package E2Checks;

import java.util.Scanner;

public class E2P07Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budgetPeter = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        int videoCardsPrice = videoCards * 250;
        double processorsPrice = (videoCardsPrice * 0.35) * processors;
        double ramMemoryPrice = (videoCardsPrice * 0.10) * ramMemory;
        double totalPrice = videoCardsPrice + processorsPrice + ramMemoryPrice;

        if (videoCards > processors){
            totalPrice = totalPrice - totalPrice * 0.15;
        }
        double diff = Math.abs(totalPrice - budgetPeter);
        if (totalPrice <= budgetPeter){
            System.out.printf("You have %.2f leva left!", diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);
        }

    }
}
