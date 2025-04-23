import java.util.Scanner;
public class Sales
{
   public static int[] findMinStats(int[] numArray)
   {
      int minStats[] = new int[2];
      for (int i=0; i<numArray.length; i++)
         {
            int min = 500;
            if (numArray[i]<min)
            {
               minStats[0] = numArray[i];
               minStats[1] = i;
            }
         }
     return minStats[];          
   }
   
   public static void main(String[] args)
   {
      final int SALESPEOPLE = 5;
      int[] sales = new int[SALESPEOPLE];
      int sum;
      Scanner scan = new Scanner(System.in);
      for (int i=0; i<sales.length; i++)
         {
         System.out.print("Enter sales for salesperson " + i + ": ");
         sales[i] = scan.nextInt();
         }
      System.out.println("\nSalesperson Sales");
      System.out.println(" ------------------ ");
      sum = 0;
      for (int i=0; i<sales.length; i++)
         {
         System.out.println(" " + i + " " + sales[i]);
         sum += sales[i];
         }
      System.out.println("\nTotal sales: " + sum);

      scan.close;
   }
}
