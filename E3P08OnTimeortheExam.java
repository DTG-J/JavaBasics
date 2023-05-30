package E3ConditonalStatements;

import java.util.Scanner;

public class E3P08OnTimeortheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());


        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;
        int diff = Math.abs(arrivalTime - examTime);


        if (arrivalTime > examTime) {
            System.out.printf("Late%n");
            if (diff < 60)
                System.out.printf("%d minutes after the start", diff);
            else {
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        } else if (diff <= 30) {
            System.out.printf("On time%n");
            if (examTime != arrivalTime) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.printf("Early%n");
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }
        }
    }
 }

