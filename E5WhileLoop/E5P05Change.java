package E5WhileLoop;

import java.util.Scanner;

public class E5P05Change{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());

        double totalChange = Math.floor(change * 100);

        int countCoins = 0;

        while (totalChange>0){

            if (totalChange>=200){
                totalChange -= 200;
                countCoins++;
            }else if (totalChange>=100){
                totalChange -= 100;
                countCoins++;
            }else if (totalChange>=50){
                totalChange -= 50;
                countCoins++;
            }else if (totalChange>=20){
                totalChange -= 20;
                countCoins++;
            }else if (totalChange>=10){
                totalChange -= 10;
                countCoins++;
            }else if (totalChange>=5){
                totalChange -= 5;
                countCoins++;
            }else if (totalChange>=2){
                totalChange -= 2;
                countCoins++;
            }else if (totalChange>=1){
                totalChange -= 1;
                countCoins++;
            }

        }
        System.out.println(countCoins);
    }
}
