/*
    Palindrome integer - Use the reverse method to implement isPalindrome.
 */
import java.util.*;


public class example6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println(isPalindrome(number));
        //System.out.println(reverse(number));
    }

    //Return the reversal of an integer, e.g., reverse(456) returns 654
    public static int reverse(int number)
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


        return reversedNum;
    }

    //Return true if the number is a palindrome
    public static boolean isPalindrome(int number)
    {
        int theReverse = reverse(number);
        if(number == theReverse)
        {
            return true;
        }
        return false;
    }
}
