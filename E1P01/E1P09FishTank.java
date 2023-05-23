package E1P01;

import java.util.Scanner;

public class E1P09FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int hight = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        int aquariumVolume = lenght * width * hight;
        double litreVolume = aquariumVolume * 0.001;
        double necessaryLiters = litreVolume * (1 -percentage / 100);
        System.out.println(necessaryLiters);




         }
}
