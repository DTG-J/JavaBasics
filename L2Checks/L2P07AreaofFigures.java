package L2Checks;

import java.util.Scanner;

public class L2P07AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figureType = scanner.nextLine();
        double area = 0;
        if (figureType.equals("square")) {double sideSquare= Double.parseDouble(scanner.nextLine());
        area = sideSquare * sideSquare;}
        else if (figureType.equals("rectangle"))
        {double sideA= Double.parseDouble(scanner.nextLine());
        double sideB= Double.parseDouble(scanner.nextLine());
        area = sideA * sideB;}
        else if (figureType.equals("circle"))
        {double radius = Double.parseDouble(scanner.nextLine());
        area = Math.PI * radius * radius; }
        else if (figureType.equals("triangle"))
        {double  a = Double.parseDouble(scanner.nextLine());
        double  h = Double.parseDouble(scanner.nextLine());area = (a * h) / 2;}
        System.out.printf("%.3f", area);



    }
        }

