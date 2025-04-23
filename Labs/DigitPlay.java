import java.util.Scanner;
public class DigitPlay
{
   public static void main (String[] args)
      {
      int num; //a number
      Scanner scan = new Scanner(System.in);
      System.out.println ();
      System.out.print ("Please enter a positive integer: ");
      num = scan.nextInt ();
      
      
      if (num <= 0)
         {
            System.out.println ( num + " isn't positive -- start over!!");
            System.out.print ("Please enter a positive integer: ");
            num = scan.nextInt ();
         }
      else
         {
            int result = numDigits(num);         
            System.out.println ("\nThe number " + num + " contains " +
            + result + " digits.");
            System.out.println ();
            System.out.println ("\nThe sum of digits in " + num + " is "+sumDigits(num));
         }
      printInReverse(1385);
      }
   // -----------------------------------------------------------
   // Recursively counts the digits in a positive integer
   // -----------------------------------------------------------
   public static int numDigits (int num)
      {
      if (num < 10)
         return (1);
      else
         return (1 + numDigits (num/10));
      }
      
   public static int sumDigits(int num)
   {
      if (num<10)
         return num;
      else
         return (num%10)+sumDigits(num/10);
   }
   
   public static void printInReverse(int num)
   {
      if (num<10)
         System.out.println(num);
      else
         {
            System.out.println(num%10);
            printInReverse(num/10);
         }
   }
}