import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner Sc= new Scanner(System.in);
    System.out.println("Enter the range of the numbers");
    int a = Sc.nextInt();
    int b = Sc.nextInt();

    int sum = 0;

    for (int i = a; i <= b; i++)
        sum = sum + i;
      System.out.println ("The sum is " + sum);
  }
}
