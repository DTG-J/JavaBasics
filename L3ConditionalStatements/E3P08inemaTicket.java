package L3ConditionalStatements;

import java.util.Scanner;

public class E3P08inemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        if (day.equals("Monday")) { System.out.println(12);}
        else if (day.equals("Tuesday")) {System.out.println(12);}
        else if (day.equals("Friday")) {System.out.println(12);}
        else if (day.equals("Wednesday")) {System.out.println(14);}
        else if (day.equals("Thursday")) {System.out.println(14);}
        else if (day.equals("Saturday")) {System.out.println(16);}
        else if (day.equals("Sunday")) {System.out.println(16);}
    }
}


   /* String dayOfWeek = scanner.nextLine();

    int price = 0;
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday")) {
                price = 12;
                } else if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")) {
                price = 14;
                } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
                price = 16;
                }

//        switch (dayOfWeek) {
//            case "Monday":
//            case "Tuesday":
//            case "Friday":
//                price = 12;
//                break;
//            case "Wednesday":
//            case "Thursday":
//                price = 14;
//                break;
//            case "Saturday":
//            case "Sunday":
//                price = 16;
//                break;
//        }

                System.out.println(price);
                }
                }*/