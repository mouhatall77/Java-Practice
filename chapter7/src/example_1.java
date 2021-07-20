/*
    Write a program that reads student scores, gets the best score, and
    then assigns grades
 */

import java.util.*;

public class example_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of student: ");
        int student = input.nextInt();
        int[] studentScores = new int[student];
        int best = 0;

        System.out.println("Enter " + student + " scores: ");
        for(int i=0; i<studentScores.length; i++)
        {
            studentScores[i] = input.nextInt();
            if(studentScores[i] > best)
                best = studentScores[i];
        }

        System.out.println("The best grade is: " + best);

        for(int i=0; i<studentScores.length; i++)
        {
            String grade;

            if( (best - 5 ) <= studentScores[i])
                grade = "A";
            else if ((best - 10 ) <= studentScores[i] && studentScores[i] < best - 5)
                grade = "B";
            else if ((best - 15 ) <= studentScores[i] && studentScores[i] < best - 10)
                grade = "C";
            else if ((best - 20 ) <= studentScores[i] && studentScores[i] < best - 15)
                grade = "D";
            else
                grade = "F";

            System.out.printf("Student %d score is %d and grade is %s \n", i, studentScores[i], grade);
        }


    }
}
