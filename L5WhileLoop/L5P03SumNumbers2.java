package L5WhileLoop;

import java.util.Scanner;

public class L5P03SumNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (sum<n){
            int num = Integer.parseInt(scanner.nextLine());
            sum +=num;

        }
        System.out.println(sum);
    }
}
