import java.util.*;
public class Main
{
    public static void main (String[]args)
    {
    Scanner Sc= new Scanner(System.in);
        //variables initialization
        int num=Sc.nextInt();
        int reverse = 0, rem;


        //loop to find reverse number
        while (num != 0)
        {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        };

        //output
        System.out.println ("Reversed Number: " + reverse);
    }
}
