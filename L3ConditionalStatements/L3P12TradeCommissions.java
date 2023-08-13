package L3ConditionalStatements;

import java.util.Scanner;

public class L3P12TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sells = Double.parseDouble(scanner.nextLine());

        double commission = 0;

        if (town.equals("Sofia")) {
            if (sells > 0 && sells <= 500) {
                commission = sells * 0.05;
            } else if (sells > 500 && sells <= 1000) {
                commission = sells * 0.07;
            } else if ((sells > 1000 && sells <= 10000)) {
                commission = sells * 0.08;
            } else if (sells > 10000) {
                commission = sells * 0.12;

            }
        }else if (town.equals("Varna")) {

                if (sells > 0 && sells <= 500) {
                    commission = sells * 0.045;
                } else if (sells > 500 && sells <= 1000) {
                    commission = sells * 0.075;
                } else if ((sells > 1000 && sells <= 10000)) {
                    commission = sells * 0.10;
                } else if (sells > 10000) {
                    commission = sells * 0.13; }

            } else if (town.equals("Plovdiv")) {

                if (sells > 0 && sells <= 500) {
                    commission = sells * 0.055;
                } else if (sells > 500 && sells <= 1000) {
                    commission = sells * 0.08;
                } else if (sells > 1000 && sells <= 10000) {
                    commission = sells * 0.12;
                } else if (sells > 10000) {
                    commission = sells * 0.145;
                }


            }

        if (commission > 0) {

            System.out.printf("%.2f", commission);
        }else {
            System.out.println("error");
        }
    }
}
