package E6NestedLoops;

import java.util.Scanner;

public class E6P0404TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int people = Integer.parseInt(scanner.nextLine());
       String input = scanner.nextLine();

       int countPresentations = 0;
       double totalsumGrades = 0;

       while (!input.equals("Finish")){


           double sumGrades = 0;

           for (int i = 1; i <= people; i++) {
               double currentGrade = Double.parseDouble(scanner.nextLine());
               sumGrades += currentGrade;
           }
           double averageGradePerPresentation = sumGrades / people;

           totalsumGrades+=averageGradePerPresentation;

           countPresentations++;

           System.out.printf("%s - %.2f.%n", input, averageGradePerPresentation);



           input = scanner.nextLine();

           }
        double averageGradeForAll = totalsumGrades / countPresentations;

        System.out.printf("Student's final assessment is %.2f.", averageGradeForAll);
        }
    }
