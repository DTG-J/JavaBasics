package Exam01;

import java.util.Scanner;

public class P06UniquePinCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        for(int i = 2; i <= num1; i+=2) {
            for(int j = 2; j <= num2; j++) {
                for(int k = 2; k <= num3; k+=2) {
                    if(j == 2 || j == 3 || j == 5 || j == 7) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
        }
    }
}

