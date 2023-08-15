package L4ForLoop;

import java.util.Scanner;

public class L4P09LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            leftSum =  leftSum + currentNum;

        }for (int j = 1; j <= n; j++) {
            int currentNum2 = Integer.parseInt(scanner.nextLine());
            rightSum =  rightSum + currentNum2;

        }

       /* for (int i = 1; i <= 2 * n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (i <= n) {
                leftSum = leftSum + currentNum;
            } else {
                rightSum = rightSum + currentNum;
        */

        if (leftSum == rightSum){
           System.out.printf("Yes, sum = %d%n" , leftSum);
        }else {
            System.out.printf("No, diff = %d%n" , Math.abs(leftSum - rightSum));}
    }
}
