import java.util.Scanner;
public class RightTriangle
{
   public static void main (String[] args)
   {
      double side1, side2; // lengths of the sides of a right triangle
      double hypotenuse; // length of the hypotenuse
      Scanner scan = new Scanner(System.in);
      // Get the lengths of the sides as input
      System.out.print ("Please enter the lengths of the two sides of " +
      "a right triangle (separate by a blank space): ");
      side1 = scan.nextDouble();
      side2 = scan.nextDouble();
      
      hypotenuse = Math.sqrt(side1*side1 + Math.pow(side2,2));
      
      System.out.println ("Length of the hypotenuse: " + hypotenuse);
   }
}