package E5WhileLoop;

import java.util.Scanner;

public class E5P06Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int allPieces = width * length;

        while (!command.equals("STOP")) {
            int currentPiece = Integer.parseInt(command);
            allPieces-=currentPiece;

            if (allPieces<=0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allPieces));
                break;
            }
            command = scanner.nextLine();

        }if (allPieces>0){
            System.out.printf("%d pieces are left.", Math.abs(allPieces));
        }

    }
}
