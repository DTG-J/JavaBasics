package E1P01;

import java.util.Scanner;

public class E1P03DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestPerYear = Double.parseDouble(scanner.nextLine());
        double amountPerMonth = (deposit * (interestPerYear / 100) / 12);
        double totalSum = deposit + amountPerMonth * months;
        System.out.println(totalSum);
        }

         }
