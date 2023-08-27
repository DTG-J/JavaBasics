package Exam01;

import java.util.Scanner;

public class P04Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());


        int group1 = 0;
        int group2 = 0;
        int group3 = 0;
        int group4 = 0;

        double scoreGroup1 = 0;
        double scoreGroup2 = 0;
        double scoreGroup3 = 0;
        double scoreGroup4 = 0;


        for (int i = 1; i <= students; i++) {
            double examScore = Double.parseDouble(scanner.nextLine());
            if (examScore >= 5) {
                group1++;
                scoreGroup1 = scoreGroup1 + examScore;
            }
            if (examScore >= 4 && examScore <= 4.99) {
                group2++;
                scoreGroup2 = scoreGroup2 + examScore;
            }
            if (examScore >= 3 && examScore <= 3.99) {
                group3++;
                scoreGroup3 = scoreGroup3 + examScore;
            }
            if (examScore < 3) {
                group4++;
                scoreGroup4 = scoreGroup4 + examScore;
            }



        }

        double topStudents = group1*1.0/students * 100;
        double secondStudents = group2 *1.0 / students * 100;
        double thirdStudents = group3 *1.0 / students * 100;
        double failedStudents = group4*1.0 / students * 100;
        double totalScore = scoreGroup1 + scoreGroup2 + scoreGroup3 + scoreGroup4;
        double totalScorePercentage1 = totalScore / students;
        double total = totalScorePercentage1 /1;



        System.out.printf("Top students: %.2f%%%n", topStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", secondStudents);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", thirdStudents);
        System.out.printf("Fail: %.2f%%%n", failedStudents);
        System.out.printf("Average: %.2f", total);


    }

}

