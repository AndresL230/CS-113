public class Final1Practice
{
   public static void main(String[] args)
   {
      String[] names = {"Monday","Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};
      
      int[] eStats = eStatistics(names);
      
      for (int i: eStats)
         System.out.println(i);
         
      System.out.print(power(2,10));
   }
   
   public static int[] eStatistics(String[] arr)
   {
      int size = arr.length;
      int[] finArray = new int[size];
      
      for (int i = 0; i<size; i+=1)
      {
         int count = 0;
         
         for (int j = 0; j<arr[i].length(); j+=1)
         {
            if (arr[i].charAt(j)=='e')
               count+=1;
         }
            
         finArray[i] = count;
      }
      
      return finArray;
   }
   
   public static int power(int base, int expo)
   {
      if (expo==0)
         return 1;
      return power(base,expo-1)*base;
   }
}