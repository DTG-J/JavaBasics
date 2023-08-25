package Exam01;

import java.util.Scanner;

public class P03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countJoinery = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String  delivery = scanner.nextLine();

        double price = 0;

        switch (type){
            case "90X130":
                if (countJoinery <=10){
                    System.out.println("Invalid order");
                    break;}
                price = countJoinery * 110;

                if (countJoinery >=30 && countJoinery <=60){
                    price = price * 0.95;
                }if (countJoinery >60){
                price = price * 0.92;}
                if (delivery.equals("With delivery")){
                    price = price + 60;

                }if (countJoinery > 99){
                    price = price * 0.96;
                }break;
            case "100X150":
                if (countJoinery <=10){
                    System.out.println("Invalid order");
                    break;}
                price = countJoinery * 140;

                if (countJoinery >=40 && countJoinery <=80){
                    price = price * 0.94;
                }if (countJoinery >80){
                price = price * 0.90;}
                if (delivery.equals("With delivery")){
                    price = price + 60;
                }if (countJoinery > 99){
                    price = price * 0.96;
                }break;
            case "130X180":
                if (countJoinery <=10){
                    System.out.println("Invalid order");
                    break;}
                price = countJoinery * 190;

                if (countJoinery >=20 && countJoinery <=50){
                    price = price * 0.93;
                }if (countJoinery >50){
                price = price * 0.88;}
                if (delivery.equals("With delivery")){
                    price = price + 60;
                }if (countJoinery > 99){
                    price = price * 0.96;
                }break;
            case "200X300":
                if (countJoinery <=10){
                    System.out.println("Invalid order");
                    break;}
                price = countJoinery * 250;

                if (countJoinery >=25 && countJoinery <=50){
                    price = price * 0.91;
                }if (countJoinery >50){
                price = price * 86;}
                if (delivery.equals("With delivery")){
                    price = price + 60;

                }if (countJoinery > 99){
                    price = price * 0.96;
                }break;


        }
        if (countJoinery > 10) {
            System.out.printf("%.2f BGN", price);
        }
    }
}
