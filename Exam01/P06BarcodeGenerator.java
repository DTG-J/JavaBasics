package Exam01;

import java.util.Scanner;

public class P06BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());



        int first = firstNum / 1000;
        int second = firstNum / 100 % 10;
        int third = firstNum / 10 % 10;
        int forth = firstNum %10;

        int lastFirst = secondNum / 1000 % 10;
        int lastSecond = secondNum / 100 % 10;
        int lastThird = secondNum / 10 % 10;
        int lastForth = secondNum % 10;

        for (int i = first; i <= lastFirst; i++) {
            for (int j = second; j <= lastSecond; j++) {
                for (int k = third; k <= lastThird; k++) {
                    for (int l = forth; l <= lastForth; l++) {

                        if (i%2!=0 && j%2!=0 && k%2!=0 && l%2!=0){
                            System.out.printf("%d%d%d%d ", i, j, k,l);
                        }

                    }

                }

            }

        }






    }
}
