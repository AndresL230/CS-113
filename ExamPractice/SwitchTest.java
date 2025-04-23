public class SwitchTest
{
   public static void main(String[] args)
   {
      char letter = 'A';
      
      switch (letter + 2)
      {
         case 'B':
            letter += 1;
         case 'C': 
            letter += 2;
         case 'D':
            letter += 2;
         default:
            letter +=1;
      }
      
      System.out.println(letter);
      
      int num = 2;
 
         switch (num)
         {
             case 1:
                 System.out.println("Case 1");
             case 2:
                 System.out.println("Case 2");
             case 3:
                 System.out.println("Case 3");
             default:
                 System.out.println("Default case");
         }
   }
}