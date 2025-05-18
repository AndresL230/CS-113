public class RecursiveMethods
{
   public static void main(String[] args)
   {
      System.out.println(factorial(6));
      System.out.println(summation(5));
      System.out.println(countHi("HixxhiHixxHi"));
      System.out.println(cs113(" CS 113 ",6));
      System.out.println(recursive(5));
      System.out.println((int)(Math.random()*10)+1);
      
      int[] array = {1,2,3,4,5};
      System.out.println(recProd(array,4));
      
      System.out.println(nOutput(4));
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
    
    public static String cs113(String s, int i)
    {
      if (i==0)
         return "";
      return cs113(s,i-1)+s;
    }
    
    public static String recursive(int x)
    {
      if (x==1)
         return "*!";
      return recursive(x-1)+"*!";
    }
    
    public static boolean checkString(String s)
    {
      if (s.length() <= 1)
        return true;

      if (s.charAt(0) != s.charAt(1))
        return false;
        
      return checkString(s.substring(1));
   }
   
   public static int recProd(int[] arr, int n)
   {
      if (n==0)
         return arr[0];
      return recProd(arr,n-1)*arr[n-1];
   }
   
   public static String nOutput(int n)
   {
      if (n==1)
         return "1 ";
      return nOutput(n-1)+n+" "+nOutput(n-1);
   }
}