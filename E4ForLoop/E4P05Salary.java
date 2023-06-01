package E4ForLoop;

import java.util.Scanner;

public class E4P05Salary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= tabs; i++) {
            String tabsName = scanner.nextLine();
            if (tabsName.equals("Facebook")) {
                salary = salary - 150;
            } else if (tabsName.equals("Instagram")) {
                salary = salary - 100;
            } else if (tabsName.equals("Reddit")) {
                salary = salary - 50;
            }

        }
        if (salary <= 0) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.println(salary);
        }
    }
}
