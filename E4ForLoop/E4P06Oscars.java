package E4ForLoop;

import java.util.Scanner;

public class E4P06Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoint = Double.parseDouble(scanner.nextLine());
        int examiners = Integer.parseInt(scanner.nextLine());

        double totalPoints = academyPoint;
        for (int i = 1; i <= examiners; i++) {

            String examinerName = scanner.nextLine();
            double examinerPoint = Double.parseDouble(scanner.nextLine());

            totalPoints = totalPoints + (examinerPoint * examinerName.length()) / 2;
            if (totalPoints >= 1250.5) {

                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                break;
            }
        }

        if  (totalPoints < 1250.5){
           System.out.printf("Sorry, %s you need %.1f more!", actorName, Math.abs(1250.5 - totalPoints));}

    }
}
