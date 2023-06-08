package Exam2;

import java.util.Scanner;

public class P04CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int catsNumber = Integer.parseInt(scanner.nextLine());

        int gr1 = 0;
        int gr2 = 0;
        int gr3 = 0;
        int group1 = 0;
        int group2 = 0;
        int group3 = 0;

        for (int i = 0; i < catsNumber; i++) {
        double foodGrams = Double.parseDouble(scanner.nextLine());
        if (foodGrams>= 100 && foodGrams<200){
            gr1++;
            group1+=foodGrams;

        }if (foodGrams>= 200 && foodGrams<300){
                gr2++;
                group2+=foodGrams;
        }if (foodGrams>= 300 && foodGrams<400){
                gr3++;
                group2+=foodGrams;
        }
        }
        double totalGrams = (group1*1.0 + group2 + group3)/1000;
        double finalPrice = totalGrams * 12.45;

        System.out.printf("Group 1: %s cats.%n", gr1);
        System.out.printf("Group 2: %s cats.%n", gr2);
        System.out.printf("Group 3: %s cats.%n", gr3);
        System.out.printf("Price for food per day: %.2f lv.%n", finalPrice);


    }
}
