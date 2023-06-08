package Exam2;

import java.util.Scanner;

public class P05PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKilos = Integer.parseInt(scanner.nextLine());
        int foodGrams = foodKilos * 1000;
        int totalEatenFood = 0;
        String input = scanner.nextLine();
        while (!input.equals("Adopted ")){
            if (input.equals("Adopted")){
                break;
            }
            int foodEaten = Integer.parseInt(input);

            totalEatenFood += foodEaten;
            input = scanner.nextLine();


        }
        int diff = Math.abs(totalEatenFood  - foodGrams);
        if (totalEatenFood> foodGrams){

            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }else {
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        }

    }
}
