/*
    Display an integer reversed
 */
import java.util.*;

public class example6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        reverse(number);
    }

    public static void reverse(int number)
    {
        int reversedNum = 0;
        int n = 1;
        while(number != 0)
        {
            //Extract last digit
            int lastDigit = number % 10;
            number = number / 10;
            reversedNum = reversedNum + lastDigit;
            //System.out.println("First reverse: " + reversedNum);

            if(number!=0)
            {
                reversedNum = (reversedNum * 10);
                //System.out.println("here " + reversedNum);
            }
            else
            {
                number = 0;
            }

        }

        System.out.println(reversedNum);
    }
}
