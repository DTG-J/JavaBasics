package E1P01;

import java.util.Scanner;

public class E1P08BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taxPerYear = Integer.parseInt(scanner.nextLine());
        Double trainers = taxPerYear - (taxPerYear * 0.40);
        Double trainingSuit = trainers - (trainers * 0.20);
        Double ball = trainingSuit / 4;
        Double accessories = ball / 5;
        Double expenditures = taxPerYear + trainers + trainingSuit + ball + accessories;

        System.out.println(expenditures + " ще са разходите на Джеси, ако започне да спортува баскетбол.");


          }
}
