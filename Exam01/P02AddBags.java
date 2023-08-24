package Exam01;

import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceBaggageOver20 = Double.parseDouble(scanner.nextLine());
        double kilos = Double.parseDouble(scanner.nextLine());
        int dayTillTravel = Integer.parseInt(scanner.nextLine());
        int numberBaggage = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        if (kilos < 10){
            totalPrice = priceBaggageOver20 * 0.20;
        } else if (kilos >=10 && kilos <=20) {
            totalPrice = priceBaggageOver20 * 0.5;
        }else {
            totalPrice = priceBaggageOver20;
        }if (dayTillTravel < 7){
            totalPrice = totalPrice * 1.4;
        }
        if (dayTillTravel >= 7 && dayTillTravel <=30){
            totalPrice = totalPrice * 1.15;
        }
        if (dayTillTravel > 30){
            totalPrice = totalPrice * 1.1;
        }
        double finalPrice = totalPrice * numberBaggage;

        System.out.printf("The total price of bags is: %.2f lv. ", finalPrice);
    }
}
