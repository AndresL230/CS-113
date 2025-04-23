public class MyMethods
{
   public int volume(int width, int length, int height)
   {
      int volume = width*length*height;
      return volume;
   }
   public double avgFaceValues(Die die1, Die die2)
   {   
      return (die1.getFaceValue()*die2.getFaceValue())/2.0;
   }     
}