package E1P01;

import java.util.Scanner;
class scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int penPacks = Integer.parseInt(scanner.nextLine());
        int highLighters = Integer.parseInt(scanner.nextLine());
        int cleaningAgent = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        Double materials = (penPacks * 5.80 + highLighters * 7.20 + cleaningAgent * 1.20);
        Double finalPrice = materials - (materials * (discount * 0.01));
        System.out.println(finalPrice);
    }
}


