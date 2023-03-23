import java.util.*;

public class Main
 {
   public static void main (String[]args)
   {
     Scanner Sc= new Scanner(System.in);
     int year = Sc.nextInt();

     if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
       System.out.println (year + " is a Leap Year");

     //not leap year
     else
         System.out.println (year + " is not a Leap Year");

   }
 }
