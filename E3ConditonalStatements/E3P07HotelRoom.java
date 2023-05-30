package E3ConditonalStatements;

import java.util.Scanner;

public class E3P07HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int night = Integer.parseInt(scanner.nextLine());


        double studioPrice = 0;
        double apartmentPrice = 0;
         switch (month){
            case "May":
            case "October":
                apartmentPrice = night * 65;
                studioPrice = night * 50;
                if (night>14) {
                    apartmentPrice = apartmentPrice * 0.9;
                    studioPrice = studioPrice * 0.7;
                }else if (night>7){
                    studioPrice = studioPrice * 0.95;
                    }break;
             case "June":
             case "September":
                 apartmentPrice = night * 68.70;
                 studioPrice = night * 75.2;
                 if (night >14){
                     apartmentPrice = apartmentPrice * 0.9;
                     studioPrice = studioPrice * 0.8;
                 }break;
             case "July":
             case "August":
                 apartmentPrice = night * 77;
                 studioPrice = night * 76;
                 if (night >14) {
                     apartmentPrice = apartmentPrice * 0.9;
                 }
        }
        System.out.printf("Apartment: %.2f lv.%n", apartmentPrice);
        System.out.printf("Studio: %.2f lv.", studioPrice);
    }
}

