package DesiExam;

import java.util.Scanner;
public class PcStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processor = Double.parseDouble(scanner.nextLine());
        double videoCard = Double.parseDouble(scanner.nextLine());
        double ramMemory = Double.parseDouble(scanner.nextLine());
        int numberOfRamMemory = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double processorsPrice = processor * 1.57;
        double videoCardsPrice = videoCard * 1.57;
        double ramMemoryPrice = (ramMemory * 1.57) * numberOfRamMemory;
        double processorFinal = processorsPrice - (processorsPrice * discount);
        double videoFinal = videoCardsPrice - (videoCardsPrice * discount);
        double totalAll = processorFinal + videoFinal + ramMemoryPrice;

        System.out.printf("Money needed - %.2f leva.", totalAll);
    }
}
