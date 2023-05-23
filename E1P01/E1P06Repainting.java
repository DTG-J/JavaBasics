package E1P01;

import java.util.Scanner;

public class E1P06Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonTotal = (nylon + 2) * 1.50;
        double paintTotal = (paint + (paint * 0.1)) * 14.50;
        double thinnerTotal = thinner * 5;
        double allMaterials = nylonTotal + paintTotal + 0.40 + thinnerTotal;
        double workForOneHour = allMaterials * 0.30;

        System.out.println(allMaterials + (workForOneHour * hours) + " e сумата на всички разходи");

    }
}
