package E2Checks;

import java.util.Scanner;

public class E2P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double oneMeterSeconds = Double.parseDouble(scanner.nextLine());

        double swimmingTime = meters * oneMeterSeconds;
        double delay = (Math.floor(meters / 15)) * 12.5;
        double totalTime = delay + swimmingTime;
        double diff = Math.abs(totalTime - recordSeconds);
        if (recordSeconds <=totalTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }


    }
    }

