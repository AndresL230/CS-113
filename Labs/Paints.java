public class Paints
{
   private double coverage; //number of square feet per gallon
   //-----------------------------------------
   // Constructor: Sets up the paints object.
   //-----------------------------------------
   public Paints(double c)
   {
      coverage = c;
   }
   //---------------------------------------------------
   // Returns the amount of paints (number of gallons)
   // needed to paint the shape given as the parameter.
   //---------------------------------------------------
   public double amount(Shape s)
   {
      System.out.println ("Computing amount for " + s);
      return 0;
   }
}