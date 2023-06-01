package E4ForLoop;

import java.util.Scanner;

public class E4P02halfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;

            if (currentNum>maxNum){
                maxNum=currentNum;
            }

        }
        int sumWithoutMaxNumber = sum - maxNum;

        if (maxNum==sumWithoutMaxNumber){
            System.out.println("Yes");
            System.out.println("Sum = " + maxNum);
        }else {int diff = Math.abs(maxNum - sumWithoutMaxNumber);
            System.out.println("No");
            System.out.println("Diff = " + diff);}
    }
}
