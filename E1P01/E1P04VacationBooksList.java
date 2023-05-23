package E1P01;

import java.util.Scanner;

public class E1P04VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int daysNeeded = Integer.parseInt(scanner.nextLine());
        int timeNeededForBook = pages / pagesPerHour;
        int hoursNeededForBook = timeNeededForBook / daysNeeded;
        System.out.println(hoursNeededForBook);

    }
}



