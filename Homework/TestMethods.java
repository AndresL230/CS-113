public class TestMethods
{
   public static void main(String[] args)
   {
      MyMethods method1 = new MyMethods();
      Die die1 = new Die();
      Die die2 = new Die();
      
      int volume = method1.volume(5,5,5);
      System.out.println("Volume of rectangular box: " + volume);
      
      System.out.println("Die 1: " + die1.getFaceValue());
      System.out.println("Die 2: " + die2.getFaceValue());
      
      System.out.print("Average Face Value of Die 1 and Die 2: " + method1.avgFaceValues(die1,die2));
   }
}