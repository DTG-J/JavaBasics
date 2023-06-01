package E4ForLoop;

import java.util.Scanner;

public class E4P03Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        double p1count = 0;
        double p2count = 0;
        double p3count = 0;
        double p4count = 0;
        double p5count = 0;

        for (int i = 1; i <= num; i++)
        { int currentNumber = Integer.parseInt(scanner.nextLine());
            if (currentNumber<200) {
                p1count++; // p1Count = p1Count + 1;
            } else if (currentNumber<=399) {;
                p2count++;
            }else if (currentNumber<=599) {
                p3count++;
            }else if (currentNumber<=799) {
                p4count++;
            }else
                p5count++;
        }

        double percentP1 = (p1count / num) *100;
        double percentP2 = (p2count / num) *100;
        double percentP3 = (p3count / num) *100;
        double percentP4 = (p4count / num) *100;
        double percentP5 = (p5count / num) *100;

        System.out.printf("%.2f%%%n", percentP1);
        System.out.printf("%.2f%%%n", percentP2);
        System.out.printf("%.2f%%%n", percentP3);
        System.out.printf("%.2f%%%n", percentP4);
        System.out.printf("%.2f%%%n", percentP5);

    }
}
