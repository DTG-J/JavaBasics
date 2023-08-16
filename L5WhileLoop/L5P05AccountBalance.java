package L5WhileLoop;

import java.util.Scanner;

public class L5P05AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();


        double sum = 0;
        while (!command.equals("NoMoreMoney")){
            double installment = Double.parseDouble(command);
            if (installment < 0) {
                System.out.print("Invalid operation!");
                break;
            }

            sum +=installment;
            System.out.printf("Increase: %.2f%n", installment);

            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", sum);
    }
}
