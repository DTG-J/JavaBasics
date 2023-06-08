package Exam2;

import java.util.Scanner;
import java.util.SimpleTimeZone;

public class P03CatLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String catBreed = scanner.nextLine();
        String catSex = scanner.nextLine();

        boolean catBreeds = true;
        int humanAge = 0;
        switch (catBreed){
            case "British Shorthair":
               if (catSex.equals("m")) {
                   humanAge = 12 * 13;
               }else {
                   humanAge = 12 * 14;
               }
               break;
            case "Siamese":
                if (catSex.equals("m")) {
                    humanAge = 12 * 15;
                }else {
                    humanAge = 12 * 16;
                }
                break;
            case "Persian":
                if (catSex.equals("m")) {
                    humanAge = 12 * 14;
                }else {
                    humanAge = 12 * 15;
                }
                break;
            case "Ragdoll":
                if (catSex.equals("m")) {
                    humanAge = 12 * 16;
                }else {
                    humanAge = 12 * 17;
                }
                break;
            case "American Shorthair":
                if (catSex.equals("m")) {
                    humanAge = 12 * 12;
                }else {
                    humanAge = 12 * 13;
                }
                break;
            case "Siberian":
                if (catSex.equals("m")) {
                    humanAge = 12 * 11;
                }else {
                    humanAge = 12 * 12;
                }
                break;
            default:
                catBreeds = false;
                System.out.printf("%s is invalid cat!", catBreed);


        }
       if (catBreeds){
        double catMonths = Math.floor(humanAge / 6);
        System.out.printf("%.0f cat months",catMonths);}

    }
}
