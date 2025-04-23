import java.util.Scanner;
public class Paint
{
   public static void main(String[] args)
   {
      int door = 20, window = 15, doorAmount, windowAmount;
      final int COVERAGE = 350;
      int length, width, height;
      double totalSqFt = 0, paintNeeded;
      Scanner userInput = new Scanner(System.in);
      
      System.out.println("Input the height: ");
      height = userInput.nextInt();
      
      //Wall 1
      System.out.println("Input the length of wall 1: ");
      length = userInput.nextInt();
      
      System.out.println("Input the width  of wall 1: ");
      width = userInput.nextInt();
      
      totalSqFt += length * width  + (width*height);
      
      //Wall 2
      System.out.println("Input the length of wall 2: ");
      length = userInput.nextInt();
      
      System.out.println("Input the width of wall 2: ");
      width = userInput.nextInt();
      
      totalSqFt += length * width + (width*height);
      
      
      //Doors and Windows      
      System.out.println("Input amount of doors: ");
      doorAmount = userInput.nextInt();
      
      System.out.println("Input amount of windows: ");
      windowAmount = userInput.nextInt();
      
      totalSqFt -= (window*windowAmount) + (door*doorAmount);
      
      paintNeeded = totalSqFt / COVERAGE;
      
      System.out.println("The length, width, and height are as follows "+length+", "+width+", "+height+" "+"and the number of gallons is "+ paintNeeded );
            
      
   }
}