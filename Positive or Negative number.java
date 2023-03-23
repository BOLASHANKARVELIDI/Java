import java.util.*;
class Main
{
  public static void main (String[]args)
  {
    Scanner Sc= new Scanner(Syatem.in);
    System.out.println("Enter the number: ");

    int num = Sc.nextInt();

    //Condition to check if the number is negative or positive

    if (num == 0)
      {
	    System.out.println ("Zero");
      }
      
    else{
        String result = num > 0 ? "The number is positive" : "The number is negative";
        System.out.println (result);
    }
  }
}
