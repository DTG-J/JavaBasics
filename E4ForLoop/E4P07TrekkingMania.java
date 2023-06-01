package E4ForLoop;

import java.util.Scanner;

public class E4P07TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int Musala = 0;
        int Montblan = 0;
        int Kilimanjaro = 0;
        int K2 = 0;
        int Everest = 0;

        for (int i = 1; i <= groups; i++) {

            int people = Integer.parseInt(scanner.nextLine());

            if (people <= 5) {
                Musala = people + Musala;

            } else if (people <= 12) {
                Montblan = people + Montblan;

            } else if (people <= 25) {
                Kilimanjaro = people + Kilimanjaro;

            } else if (people <= 40) {
                K2 = people + K2;

            } else {
                Everest = people + Everest;

            }

        }
        int allPeople = Musala + Montblan + Kilimanjaro + K2 + Everest;
        double MusalaPercentage = Musala * 1.0 / allPeople * 100;
        double MontblanPercentage = Montblan * 1.0 / allPeople * 100;
        double KilimanjaroPercentage = Kilimanjaro * 1.0 / allPeople * 100;
        double K2Percentage = K2 * 1.0 / allPeople * 100;
        double EverestPercentage = Everest * 1.0 / allPeople * 100;

        System.out.printf("%.2f%%%n", MusalaPercentage);
        System.out.printf("%.2f%%%n", MontblanPercentage);
        System.out.printf("%.2f%%%n", KilimanjaroPercentage);
        System.out.printf("%.2f%%%n", K2Percentage);
        System.out.printf("%.2f%%%n", EverestPercentage);


    }
}
