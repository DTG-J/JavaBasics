package E5WhileLoop;

import java.util.Scanner;

public class E3P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());


        int daycounter = 0;
        int spendingcounter = 0;

        while (ownedMoney < neededMoney) {
            if (spendingcounter==5){
                break;
            }
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
            daycounter++;
            if (command.equals("spend")) {
                spendingcounter ++;
                ownedMoney -= money;

            } else if (command.equals("save")) {
                    ownedMoney += money;
                    spendingcounter = 0;
            }
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }

        }
        if (spendingcounter == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", daycounter);
        }else {
            System.out.printf("You saved the money for %d days.", daycounter);
        }
    }
}
