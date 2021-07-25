import java.util.Arrays;
import java.util.Scanner;

public class example7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = createArray();

        System.out.println(Arrays.toString(number));

    }

    //create and populate an array with user input
    public static int[] createArray()
    {
        Scanner input = new Scanner(System.in);
        int[] number = new int[50];
        int count = 0;
        System.out.println("Enter the integers between 1 and 50: ");
        while (true)
        {
            int next = input.nextInt();
            if(next == 0)
            {
                break;
            }
            else
            {
                number[count] = next;
                count++;
            }
        }

        return number;
    }

    //Count occurences for each number
    public static int[] countOccurence(int[] numbers)
    {
        int[] counts = new int[10];

        for (int i=0; i< numbers.length; i++)
        {
            counts[numbers[i]]++;
        }

        return counts;
    }
}
