package L5WhileLoop;

import java.util.Scanner;

public class L5P03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < num; i++) {
            int nextNum = Integer.parseInt(scanner.nextLine());
            sum += nextNum;
            if (sum >= num){
                System.out.printf("%d", sum);
                break;
            }

            
        }
    }
}
