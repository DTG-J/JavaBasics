package L4ForLoop;

import java.util.Scanner;

public class L4P10OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        int evenNumSum = 0;
        int oddNumSum = 0;

        for (int i = 1; i <=n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (i%2==0){
                evenNumSum = evenNumSum + currentNum;
            }else {
                oddNumSum = oddNumSum + currentNum;
            }
            
        }
        if (evenNumSum == oddNumSum){
            System.out.println("Yes");
            System.out.printf("Sum = " + evenNumSum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = " + Math.abs(evenNumSum - oddNumSum));


        }
    }
}
