import java.util.Scanner;

public class L3P05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        switch (town) {
            case "Sofia" -> {
                switch (product) {
                    case "coffee" -> price = 0.50;
                    case "water" -> price = 0.80;
                    case "beer" -> price = 1.20;
                    case "sweets" -> price = 1.45;
                    case "peanuts" -> price = 1.60;
                }
            }
            case "Plovdiv" -> {
                if (product.equals("coffee")) {
                    price = 0.40;

                } else if (product.equals("water")) {
                    price = 0.70;

                } else if (product.equals("beer")) {
                    price = 1.15;

                } else if (product.equals("sweets")) {
                    price = 1.30;

                } else if (product.equals("peanuts")) {
                    price = 1.50;

                }
            }
            case "Varna" -> {
                if (product.equals("coffee")) {
                    price = 0.45;

                } else if (product.equals("water")) {
                    price = 0.70;

                } else if (product.equals("beer")) {
                    price = 1.10;

                } else if (product.equals("sweets")) {
                    price = 1.35;

                } else if (product.equals("peanuts")) {
                    price = 1.55;

                }
            }
        }
        double result = quantity * price;
        System.out.println(result);

    }


}

