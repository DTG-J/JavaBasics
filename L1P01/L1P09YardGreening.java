package L1P01;

import java.util.Scanner;

public class L1P09YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double m2forLandscaping = Double.parseDouble(scanner.nextLine());

        Double priceForYardWithoutDiscount = m2forLandscaping * 7.61;
        Double discount = priceForYardWithoutDiscount * 0.18;
        System.out.println("The final price is "+ (priceForYardWithoutDiscount - discount) + " lv.");
        System.out.println("The discount is " + discount + " lv.");
    }
}
