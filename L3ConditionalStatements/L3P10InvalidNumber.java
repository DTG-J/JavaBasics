package L3ConditionalStatements;

import java.util.Scanner;

public class L3P10InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        if (number >= 100 && number <= 200 || number == 0) {
            System.out.println();

        } else System.out.println("invalid");
    }
}
/*
    int num = Integer.parseInt(scanner.nextLine());
    boolean isValid = num >= 100 && num <= 200 || num == 0;
         if (!isValid) {
                System.out.println("invalid");
                }

                */
