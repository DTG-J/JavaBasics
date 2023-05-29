package E2Checks;

import java.util.Scanner;

public class E2P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacation = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int toys = puzzles + dolls + teddyBears + minions + trucks;
        double toysPrice = puzzles * 2.60 + dolls * 3.0 + teddyBears * 4.10 + minions * 8.20 + trucks * 2.0;

        if (toys >= 50) {
            toysPrice = toysPrice - toysPrice * 0.25;

        }

        double rent = toysPrice * 0.10;
        double profit = toysPrice - rent;
        double diff = Math.abs(profit - vacation);

        if (profit>=vacation){
            System.out.printf("Yes! %.2f lv left.",diff);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }


    }
}
