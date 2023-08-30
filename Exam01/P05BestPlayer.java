package Exam01;

import java.util.Scanner;

public class P05BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
String name = "";
int maxGoalCount = 0;

while (!input.equals("END")){
    int goals = Integer.parseInt(scanner.nextLine());
    if (goals > maxGoalCount){
        maxGoalCount = goals;
        name = input;
    }
    if (maxGoalCount >= 10){
        break;
    }

    input = scanner.nextLine();

        }
        System.out.printf("%s is the best player!%n", name);
if (maxGoalCount >= 3) {

            System.out.printf("He has scored %d goals and made a hat-trick !!!%n", maxGoalCount);
            }
        else  {
            System.out.printf("He has scored %d goals.", maxGoalCount);

        }
    }
}
