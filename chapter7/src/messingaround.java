import java.util.Arrays;
import java.util.Scanner;

public class messingaround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] values = new int[5];
        int input;
        int count = 0;

        input = sc.nextInt();
        values[count] = input;
        count +=1;

        input = sc.nextInt();
        values[count] = input;
        count +=1;

        input = sc.nextInt();
        values[count] = input;
        count +=1;

        System.out.println("Value of count is: " + count);
        System.out.println("The Array values is: " + Arrays.toString(values));
    }
}
