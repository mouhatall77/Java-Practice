import java.util.Scanner;

public class example_7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 11 numbers: ");
        int number[] = new int[11];

        for (int i=0; i<number.length; i++)
        {
            number[i] = input.nextInt();
        }

        for (int i=0; i<number.length; i++)
        {
            if (number[i] > number[10])
                System.out.printf("The number %d is Greater \n", number[i]);
            else if (number[i] < number[10])
                System.out.printf("The number %d is Smaller \n", number[i]);
            else
                System.out.printf("Equal \n");
        }
    }
}
