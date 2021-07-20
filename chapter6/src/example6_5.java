/*
    Sort three numbers in increasing order
 */
import java.util.*;

public class example6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        displaySortedNumber(num1, num2, num3);
    }

    public static void displaySortedNumber(double num1, double num2, double num3)
    {
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.printf("The number sorted in increasing order: %f, %f, %f%n", num1, num2, num3);
    }
}
