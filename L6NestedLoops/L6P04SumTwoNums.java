package L6NestedLoops;

import java.util.Scanner;

public class L6P04SumTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;
        int count = 0;
        for (int i = startNum; i <= endNum; i++) {
            for (int j = startNum; j <= endNum; j++) {
                int sum = i + j;
                count++;
                if (sum==magicNum){
                    isValid=true;
                    System.out.printf("Combination N:%d", count);
                    System.out.printf(" (%d + %d = %d)" ,i, j, sum);
                    break;

                }

            }
        if (isValid) {
            break;
        }
        }
        if (!isValid)
        {System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}
