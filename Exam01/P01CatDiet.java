package Exam01;

import java.util.Scanner;

public class P01CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fats = Integer.parseInt(scanner.nextLine());
        int proteins = Integer.parseInt(scanner.nextLine());
        int carbs = Integer.parseInt(scanner.nextLine());
        int allCalories = Integer.parseInt(scanner.nextLine());
        int water = Integer.parseInt(scanner.nextLine());

        double currentFats = (fats*1.0 * allCalories/100) / 9;
        double currentProtein = (proteins*1.0 * allCalories /100) / 4;
        double currentCarbs = (carbs* 1.0 * allCalories /100) / 4;
        double allFood = currentFats + currentProtein + currentCarbs;
         double gramCalories = allCalories / allFood;

         double caloriesWithoutWater = 100 - water;
         double finalCalories = caloriesWithoutWater * gramCalories/100;


        System.out.printf("%.4f", finalCalories);


    }
}
