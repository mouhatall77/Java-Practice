/*
    Method that computes the sum of the digits in an integer.
 */
import java.util.*;

public class example6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long computeThis = input.nextInt();

        System.out.println(sumDigits(computeThis));
    }

    public static int sumDigits(long n)
    {
        int sum = 0;
        while(n!= 0)
        {
            //Extract last digit
            sum += n % 10;

            //Remove last digit
            n = n / 10;

        }

        return sum;
    }
}
