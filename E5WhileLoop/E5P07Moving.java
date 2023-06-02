package E5WhileLoop;

import java.util.Scanner;

public class E5P07Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int homeVolume = width * height * length;



            while ( !command.equals("Done")) {
                int currentBoxes = Integer.parseInt(command);
                homeVolume -= currentBoxes;

                if (homeVolume <= 0) {
                    System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(homeVolume));
                    break;
                }

                command = scanner.nextLine();
            }

          if (homeVolume>0){System.out.printf("%d Cubic meters left.", Math.abs(homeVolume));
        }

    }
}
