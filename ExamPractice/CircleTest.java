import java.util.Scanner;

public class CircleTest
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
            
      Circle[] circles = new Circle[50];
      
      for (int i = 0; i<circles.length; i++)
      {
         System.out.print("Input x for circle "+ (i+1) +": ");
         int x = scan.nextInt();
         
         System.out.print("Input y for circle "+ (i+1) +": ");
         int y = scan.nextInt();
         
         System.out.print("Input radius for circle "+ (i+1) +": ");
         float radius = scan.nextFloat();
         
         circles[i] = new Circle(x,y,radius);
      }
      
      Point origin = new Point(0,0);
      int count = 0;
      
      for (int i = 0; i<circles.length; i++)
      {
         if (circles[i].liesOnCircle(origin))
            count++;
      }
      
      System.out.println("Number of circles containing 0,0 on their circumference: "+ count);      
      
   }   
}