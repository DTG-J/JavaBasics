package Exam01;

import java.util.Scanner;

public class P04EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int customers = Integer.parseInt(scanner.nextLine());
        double profit = 0;
        double totalSum = 0;
        for (int i = 1; i <= customers; i++) {
        String input = scanner.nextLine();
        int purchase  = 0;
        double basket = 0;
        double wreath = 0;
        double chocolateBunny = 0;

        while (!input.equals("Finish")){
            String cake = input;
            purchase++;
            if (cake.equals("basket")){
                basket += 1.50;
            }if (cake.equals("wreath")){
                wreath += 3.80;
            }if (cake.equals("chocolate bunny")){
                chocolateBunny += 7.0;
            }
            input = scanner.nextLine();
            totalSum =  (basket + wreath + chocolateBunny);
        }
            if (purchase%2==0){
                totalSum = totalSum * 0.80;
            }
            profit = profit + totalSum;
            System.out.printf("You purchased %d items for %.2f leva.%n", purchase, totalSum);
        }
        double average = profit / customers;
        System.out.printf("Average bill per client is: %.2f leva.%n", average );
    }
}
