package E3ConditonalStatements;

import java.util.Scanner;

public class E3P06OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double num = 0;

    if (operator.equals("+")){
        num = num1 + num2;
        if (num % 2 == 0){
            System.out.printf("%d %s %d = %.0f - even", num1, operator, num2, num);
        } else {
        System.out.printf("%d %s %d = %.0f - odd, num1, operator, num2, num");
        }
    }
     if (operator.equals("-")) {
        num = num1 - num2;
        if (num % 2 == 0){
            System.out.printf("%d %s %d = %.0f - even", num1, operator, num2, num);
    }else {
        System.out.printf("%d %s %d = %.0f - odd", num1, operator, num2, num);
        }
     }
     if (operator.equals("*")) {
         num = num1 * num2;
         if (num % 2 == 0) {
             System.out.printf("%d %s %d = %.0f - even", num1, operator, num2, num);
         } else {
             System.out.printf("%d %s %d = %.0f - odd", num1, operator, num2, num);
         }
     }
    if (operator.equals("/")) {
        if (num2 == 0){
            System.out.printf("Cannot divide %d by zero", num1);
        }else {
            num = num1 * 1.0 / num2;
            System.out.printf("%d %s %d = %.2f", num1, operator, num2, num);
         }
    }
        if (operator.equals("%")) {
            if (num2 == 0) {
                System.out.printf("Cannot divide %d by zero", num1);
            } else {
                num = num1 * 1.0 % num2;
                System.out.printf("%d %s %d = %.0f", num1, operator, num2, num);

            }
        }
   }
}
