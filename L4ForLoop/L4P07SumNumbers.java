package L4ForLoop;

import java.util.Scanner;

public class L4P07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum = currentNum + sum;


        }

        System.out.println(sum);
    }
}
