package L5WhileLoop;

import java.util.Scanner;

public class L5P02Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        String newPass = scanner.nextLine();
        while (!password.equals(newPass)){

            newPass = scanner.nextLine();

        }
        System.out.printf("Welcome %s!", username);
    }
}
