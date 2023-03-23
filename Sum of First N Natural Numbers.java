import java.util.*;
public class Main
 {
   public static void main (String[]args)
   {
    Scanner Sc=new Scanner(System.in);
    System.out.println("Enter the number of N value"); 
     int n = Sc.nextInt();
     int sum = 0;

     for (int i = 1; i <= n; i++)
         sum += i;
       System.out.println (sum);
   }
 }
