package L1P01;

import java.util.Scanner;

public class L1P08PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFoodPacks = Integer.parseInt(scanner.nextLine());
        int catFoodPacks = Integer.parseInt(scanner.nextLine());
        System.out.println(dogFoodPacks * 2.50 + catFoodPacks * 4 + " lv.");
    }
}
