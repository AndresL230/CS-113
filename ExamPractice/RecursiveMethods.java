public class RecursiveMethods
{
   public static void main(String[] args)
   {
      System.out.println(factorial(6));
      System.out.println(summation(5));
      System.out.println(countHi("HixxhiHixxHi"));
   }
   
   public static int factorial(int i)
   {
      if (i == 1)
         return 1;
         
      else
         return factorial(i-1)*i;
   }
   
   public static int summation(int i)
   {
      if (i == 1)
         return 4;
      else
         return summation(i-1)+(3+i);
   }

   public static int countHi(String str) {
      if (str.length()<=1)
        return 0;
      
      if (str.substring(str.length()-2).equals("Hi"))
        return countHi(str.substring(0, str.length() - 1))+1;
      else
        return countHi(str.substring(0, str.length() - 1));
    }
    
}