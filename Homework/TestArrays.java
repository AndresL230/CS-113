import java.util.Random;
public class TestArrays
{
   public static void main(String[] args)
   {
      int[] freq = numberFreq();
      
      System.out.print("Random frequency of numbers 0-5: ");
      
      for (int i = 0; i<freq.length; i++)
         System.out.print(freq[i]+",  ");
      
      System.out.println();
      
      int fibTotal = 15;
         
      System.out.print("Fibonacci Sequence Numbers up to " + fibTotal + ": ");
      
      int[] fibo = fibo(fibTotal);
      
      for (int i = 0; i<fibo.length; i++)
         System.out.print(fibo[i]+",  ");
      
      Die die1 = new Die();
      Die die2 = new Die();
      Die die3 = new Die();
      Die die4 = new Die();
      Die die5 = new Die();
      Die die6 = new Die();
      Die die7 = new Die();
      
      Die[] dieArray = {die1, die2, die3, die4, die5, die6, die7};
            
      System.out.print("\nOdd die count in dieArray: "+oddDice(dieArray));

   }
   
   public static int[] numberFreq()
   {
      Random rand = new Random();
      int[] freq = {0,0,0,0,0,0};
      
      for (int i=0; i<100; i++)
      {
         int randint = rand.nextInt(6);
         
         if (randint == 0)
            freq[0] += 1;
         else if (randint == 1)
            freq[1] += 1;
         else if (randint == 2)
            freq[2] += 1;
         else if (randint == 3)
            freq[3] += 1;
         else if (randint == 4)
            freq[4] += 1;
         else
            freq[5] += 1;
      }
      return freq;
   }
   
   public static int[] fibo(int total)
   {
      int[] fibo = new int[total];
      
      int num1 = 1;
      int num2 = 1;
      
      for (int i=0; i<total; i++)
      { 
         
         fibo[i] = num1;
         
         int nextnum = num1+num2;
         num1 = num2;
         num2 = nextnum;
      }
      
      return fibo;
   }
   
   public static int oddDice(Die[] dieArray)
   {
      int oddTotal = 0;
      
      for (int i = 0; i<dieArray.length; i++)
      {
         if (dieArray[i].getFaceValue()%2==1)
            oddTotal+=1;
      }
      return oddTotal;
   }
}