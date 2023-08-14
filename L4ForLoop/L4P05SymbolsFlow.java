package L4ForLoop;

import java.util.Scanner;

public class L4P05SymbolsFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            System.out.println(letter);



        }
    }
}
