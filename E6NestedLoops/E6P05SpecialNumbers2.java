package E6NestedLoops;

import java.util.Scanner;

public class E6P05SpecialNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {

            int first = i / 1000;
            int second = i / 100 % 10;
            int third = i / 10 % 10;
            int forth = i % 10;

            boolean firstDigit = num % first == 0;
            boolean secondDigit = second != 0 && num % second ==0;
            boolean thirdDigit = third != 0 && num % third == 0;
            boolean forthDigit = forth != 0 && num % forth == 0;

            if (firstDigit && secondDigit && thirdDigit && forthDigit){
                System.out.printf("%d ", i);
            }

        }
    }
}
