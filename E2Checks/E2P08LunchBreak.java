package E2Checks;

import java.util.Scanner;

public class E2P08LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String serial = scanner.nextLine();
        int episodeLength = Integer.parseInt(scanner.nextLine());
        int breakLength = Integer.parseInt(scanner.nextLine());

        double lunchBreak = 1.0 * breakLength  / 8;
        double freeTime =  1.0 * breakLength / 4;
        double timeLeft = breakLength - lunchBreak - freeTime;
        double diff = Math.ceil(timeLeft - episodeLength);
        if (timeLeft >= episodeLength){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",
                    serial, Math.ceil(timeLeft - episodeLength));
        }else if (timeLeft < episodeLength) {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",
                    serial, Math.ceil(episodeLength - timeLeft));
        }

    }
}
