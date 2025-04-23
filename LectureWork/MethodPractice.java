public class MethodPractice
{
   public int faceValue;
   
   public void roll()
   {
      faceValue = (int)(Math.random() * 6) + 1;
   }
}