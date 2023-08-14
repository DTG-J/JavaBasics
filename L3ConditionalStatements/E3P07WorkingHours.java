package L3ConditionalStatements;

import java.util.Scanner;

public class E3P07WorkingHours {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();
       boolean workingDay = day.equals("Monday")||
               day.equals("Tuesday")||
               day.equals("Wednesday")||
               day.equals("Thursday")||
               day.equals("Friday")||
               day.equals("Saturday");
       boolean wokringHours = hour >=10 && hour <= 18;
       if (workingDay && wokringHours)
        {  System.out.println("open");}
       else {
           System.out.println("closed");}

    }
}
