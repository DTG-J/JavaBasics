package E6NestedLoops;

import java.util.Scanner;

public class E6P02EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <= secondNum; i++) {

            int firstDigit = i / 100000;
            int secondDigit = i / 10000 % 10;
            int thirdDigit = i / 1000 % 10;
            int forthDigit = i / 100 % 10;
            int fifthDigit = i / 10 % 10;
            int sixthDigit = i % 10;

            int evenSum = secondDigit + forthDigit + sixthDigit;
            int oddSum = firstDigit + thirdDigit + fifthDigit;

            if (evenSum == oddSum){
                System.out.printf("%d ", i);
            }

        }
    }
}
