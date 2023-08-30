package Exam01;

import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int goal = Integer.parseInt(scanner.nextLine());


        String winner = "";
        int totalGoal = 0;

        while(!name.equals("END")) {

            winner = name;
            totalGoal = goal;
            if (goal >= 10) {
                break;
            }
            name = scanner.nextLine();
            if (name.equals("END")) {
                break;
            }
            goal = Integer.parseInt(scanner.nextLine());

        }
        System.out.printf("%s is the best player!%n",winner);
        if (totalGoal >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!%n",totalGoal);

        } else {
            System.out.printf("He has scored %d goals.", totalGoal);
        }

    }
}

