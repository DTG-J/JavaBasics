package L5WhileLoop;

import java.util.Scanner;

public class L5P08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();


        int poorGrade = 0;
        int clas = 0;
        double totalYearGrades = 0;

        for (int i = 0; i <=12 ; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            clas++;
            if (grade > 4) {
                totalYearGrades = totalYearGrades + grade;
            }
            if (grade < 4) {
                poorGrade++;
            }
            if (poorGrade > 1) {
                break;
            }
            if (clas == 12) {
                System.out.printf("%s graduated. Average grade: %.2f ", name, totalYearGrades / (clas * 1.0));
            }
        }

        if (poorGrade > 1){
            System.out.printf("%s has been excluded at %d grade", name, clas -1);
           }

    }
}
