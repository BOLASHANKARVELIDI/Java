import java.util.*;

public class Main
 {
   public static void main (String[]args)
   {
    Scanner Sc=new Scanner(System.in);
     int i;
     System.out.println("Enter the number: ");
     int n=Sc.nextInt();
     boolean isprime= true;

     // 0 and 1 are not prime numbers also, negative numbers are not prime
     if(n < 2)
     {
         isprime = false;
     }
     else
     {
     // running loop till n is wasteful because for any number n the numbers in the range(n/2 + 1, n) won't be divisible anyways.
         for(i=2; i <= n/2; i++)
         {
             if(n % i == 0)
             {
                 isprime = false;
                 break;
             }
         }
     }

     String result = isprime ? "Prime" : "not Prime";
     System.out.println ("The number " + n + " is : " + result);

   }
 }
