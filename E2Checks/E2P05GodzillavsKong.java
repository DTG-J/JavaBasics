package E2Checks;

import java.util.Scanner;

public class E2P05GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double filmBudget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double outfit = Double.parseDouble(scanner.nextLine());

        double decor = filmBudget * 0.1;
        double totalOutfitExpenses = statists * outfit;
        if (statists>150){
            totalOutfitExpenses = totalOutfitExpenses - totalOutfitExpenses * 0.10;
        }
        double totalFilmCosts = decor + totalOutfitExpenses;
        double diff = Math.abs(filmBudget - totalFilmCosts);
        if (totalFilmCosts > filmBudget){
            System.out.printf("Not enough money!%n");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }else {
            System.out.printf("Action!%n");
            System.out.printf("Wingard starts filming with %.2f leva left.",diff);
        }

    }
}
