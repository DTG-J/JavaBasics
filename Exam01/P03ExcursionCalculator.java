package Exam01;

import java.util.Scanner;

public class P03ExcursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double finalPrice = 0;
        double price = 0;
        switch (season){
            case "spring":
                if (people <= 5){
                    price = 50;
                    finalPrice = price *people;
                } else  {
                    price = 48;
                    finalPrice = price *people;
                }break;

            case "summer":
                if (people <= 5){
                    price = 48.50;
                    double finalPrice1 = price *people;
                    finalPrice = finalPrice1 * 0.85;

                } else  {
                    price = 45;
                    double finalPrice1 = price *people;
                    finalPrice = finalPrice1 * 0.85;
                }break;


            case "autumn":
                if (people <= 5){
                    price = 60;
                    finalPrice = price *people;
                } else {
                    price = 49.50;
                    finalPrice = price *people;
                }break;

            case "winter":
                if (people <= 5){
                    price = 86;
                    double final1= price * people;
                    finalPrice = final1 + finalPrice * 0.08;
                } else  {
                    price = 85;

                    double final1= price * people;
                    finalPrice = final1 + final1 * 0.08;
                }break;


        }

        System.out.printf("%.2f leva.", finalPrice);

    }
}
