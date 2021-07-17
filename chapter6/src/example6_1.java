/*
  Write a method with the following header that returns a pentagonal number
  Defined as n(3n-1)/2
 */
import java.util.*;

public class example6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        System.out.println(getPentagonalNumber(n));
    }

    public static int getPentagonalNumber(int n)
    {
        return n*(3*n-1)/2;
    }
}
