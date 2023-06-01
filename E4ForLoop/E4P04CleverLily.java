package E4ForLoop;

import java.util.Scanner;

public class E4P04CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lilyAge = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());


        double sum = 0;
        int countToys = 0;
        //double savedEvenMoney = 10;


        for (int i = 1; i <= lilyAge; i++) {
            if (i  % 2 == 0  ) {
                sum = sum + (i * 5 - 1 );         //sum = sum + (currentAge * 5 - 1); // sum += currentAge * 5 - 1
                //sum +=  savedEvenMoney
                // savedEvenMoney = 10;
                //sum--

            } else {
            countToys++; }
        }

        sum+=countToys * toyPrice;
        double diff = Math.abs(sum - washingMachinePrice);

        if (sum >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        }else {
            System.out.printf("No! %.2f", diff);
        }


    }
}
