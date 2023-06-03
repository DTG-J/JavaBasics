package E6NestedLoops;

import java.util.Scanner;

public class E6P03SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int sumPrimeNums = 0;
        int sumNonPrimeNums = 0;

        while (!input.equals("stop")){

            int currentNum = Integer.parseInt(input);

            boolean isPrime = true;

                if (currentNum < 0){
                    System.out.println ("Number is negative.");
                    input = scanner.nextLine();
                    continue;
                }

            for (int i = 2; i < currentNum; i++) {
                if (currentNum % i == 0){
                    isPrime = false;
                    sumNonPrimeNums += currentNum;
                    break;
                }
            }
            if (isPrime) {
                sumPrimeNums += currentNum;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", sumPrimeNums);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrimeNums);

    }
}
