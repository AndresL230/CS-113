public class TestRecursion
{
   public static void main(String[] args)
   {
      System.out.println("--------printDigits() Method Output--------");
      printDigits(12898459);
      
      int[] arr = {1,3,2,5};
      System.out.println("\n--------sumArray() Method Output--------");
      System.out.println(sumArray(arr,3));
   }

   public static void printDigits(int num)
   {
      if (num<10)
      {
         System.out.println(num);
      }
      
      else
      {
         printDigits(num/10);
         System.out.println(num%10);
      }
   }
   
   public static int sumArray(int[] arr, int count)
   {
      if (count==1)
      {
         return arr[0];
      }
      else
      {
         return arr[count-1]+sumArray(arr, count-1);
      }
      
   }
}