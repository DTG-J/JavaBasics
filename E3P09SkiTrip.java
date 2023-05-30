package E3ConditonalStatements;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class E3P09SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stay = Integer.parseInt(scanner.nextLine());
        String accommodation = scanner.nextLine();
        String assessment = scanner.nextLine();

        int nights = stay - 1;
        double price = 0;
    switch (accommodation){
        case "room for one person":
            price = 18 * nights;
         break;

        case "apartment":
            price = 25 * nights;
            if (nights<10){
                price = price * 0.70;
            } else if (nights>=10 && nights <=15) {
                price = price * 65;
            }else {
                price = price * 0.50;
            }break;
        case "president apartment":
            price = nights * 35;
            if (nights < 10){
                price = price * 0.9;// price - price * 0.3
            } else if (nights <= 15) {
                price = price * 0.85;// price - price * 0.35
            }else {
                price = price * 0.8;}
            break;

    }
        if (assessment.equals("positive")){
            price = price * 1.25;
        } else if (assessment.equals("negative")) {
            price = price * 0.9;
        }
        System.out.printf("%.2f", price);

    }
}
