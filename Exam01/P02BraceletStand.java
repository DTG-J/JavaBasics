package Exam01;

import java.util.Scanner;

public class P02BraceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dayMoney = Double.parseDouble(scanner.nextLine());
        double sellsDayMoney = Double.parseDouble(scanner.nextLine());
        double allExpenses = Double.parseDouble(scanner.nextLine());
        double presentPrice = Double.parseDouble(scanner.nextLine());

        double savedMoney = 5 * dayMoney;
        double earnedMoney = 5 * sellsDayMoney;
        double allSavedMoney =  savedMoney + earnedMoney;
        double savedMoneyWithoutExpenses = allSavedMoney - allExpenses;

        if (savedMoneyWithoutExpenses >= presentPrice){
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", savedMoneyWithoutExpenses);
        }else {
            double diff = Math.abs(savedMoneyWithoutExpenses - presentPrice);
            System.out.printf("Insufficient money: %.2f BGN.", diff);
        }


    }
}
