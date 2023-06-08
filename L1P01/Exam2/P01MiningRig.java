package Exam2;

import java.util.Scanner;

public class P01MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int videoCardPrice = Integer.parseInt(scanner.nextLine());
        int switchPrice = Integer.parseInt(scanner.nextLine());
        double currentPricePerDay = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());



        int totalCardsPrice = videoCardPrice * 13;
        int totalSwitchPrice = switchPrice * 13;
        int totalSpentMoney = totalCardsPrice + totalSwitchPrice + 1000;
        double profit = profitPerDay - currentPricePerDay;
        double totalProfit = 13 * profit;
        double dayProfit = Math.ceil(totalSpentMoney / totalProfit);

        System.out.println(totalSpentMoney);
        System.out.printf("%.0f", dayProfit);









    }
}
