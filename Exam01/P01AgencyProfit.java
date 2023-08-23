package Exam01;

import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String companyName = scanner.nextLine();
        int numberOfAdultTickets = Integer.parseInt(scanner.nextLine());
        int numberOfChildrenTickets = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double serviceFee = Double.parseDouble(scanner.nextLine());

        double adultTicket = adultTicketPrice + serviceFee;
        double childTicket = adultTicketPrice * 0.30 + serviceFee;
        double totalTicketPrice = adultTicket * numberOfAdultTickets + childTicket * numberOfChildrenTickets;
        double finalPrice = totalTicketPrice * 0.20;


        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", companyName, finalPrice);







    }
}
