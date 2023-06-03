package E6NestedLoops;

import java.util.Scanner;

public class E6P06CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int totalTickets = 0;
        int studentCount = 0;
        int standardCount = 0;
        int kidCount = 0;

        while (!input.equals("Finish")){
            String filmName = input;
            int freeSeats = Integer.parseInt(scanner.nextLine());

            int countTicketsPerMovie = 0;
            String command = scanner.nextLine();
                while (!command.equals("End")){
                 countTicketsPerMovie++;
                switch (command){
                    case "student":{
                        studentCount++;
                        break;
                    }case "standard":{
                        standardCount++;
                        break;
                    }case "kid":{
                        kidCount++;
                        break;
                    }
                }
                if (countTicketsPerMovie >= freeSeats) {
                    break;
                }
                command = scanner.nextLine();
                }
            totalTickets+=countTicketsPerMovie;

            double occupiedHallCapacity = countTicketsPerMovie * 1.0 / freeSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", filmName, occupiedHallCapacity);
            input = scanner.nextLine();

        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentCount *1.0 / totalTickets *100);
        System.out.printf("%.2f%% standard tickets.%n", standardCount *1.0 / totalTickets *100);
        System.out.printf("%.2f%% kids tickets.%n", kidCount *1.0 / totalTickets *100);

    }
}
