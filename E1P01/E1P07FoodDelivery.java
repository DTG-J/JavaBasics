package E1P01;

import java.util.Scanner;

public class E1P07FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());
        double desert = ((chickenMenu * 10.35) + (fishMenu *12.40) + (veganMenu * 8.15)) * 0.20;

        System.out.println((chickenMenu * 10.35) + (fishMenu *12.40) + (veganMenu * 8.15) + desert + 2.50+" цена на поръчката");

    }
}
