package DesiExam;

import java.util.Scanner;

public class SumMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;
        for (int a = 1; a <= 9 ; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9 ; c++) {
                    for (int d = 9; d >= c; d--) {

                        int total = a + b + c + d;
                        int multiplication = a * b * c * d;


                        if (n % 10 == 5 && total == multiplication) {
                            System.out.printf("%d%d%d%d", a, b, c, d);
                            isValid = true;
                            break;
                        } else if (multiplication / total == 3 && n % 3 == 0) {
                            System.out.printf("%d%d%d%d", d, c, b, a);
                            isValid = true;
                            break;
                        }
                    }
                  if (isValid){
                    break;
                  }
                }
                
            }
            
        }
        if (!isValid){
            System.out.println("Nothing found");
        }

    }
}
