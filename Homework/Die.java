public class Die
{
   //attributes
   private int faceValue;
   //default constructor
   public Die()
   {
      roll();
   }
      //constructor with parameters
      public Die(int number){
      faceValue = number;
   }
   //methods
   public void roll()
   {
      faceValue = (int)(Math.random() * 6) + 1;
   }
   //getter method for faceValue
   public int getFaceValue()
   {
      return faceValue;
   }
   //setter method for faceValue
   public void setFaceValue(int number)
   {
      faceValue = number;
   }
   //toString() method
   public String toString()
   {
      String result = "Die with face value " + faceValue;
      return result;
   }
}
