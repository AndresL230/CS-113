public class Cylinder extends Circle
{
   private double height;
   
   public Cylinder(double radius, double height)
   {
      super(radius);
      this.height = height;
   }
   
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public String toString()
   {
      return "Cylinder: Radius = " + radius+", Height = "+height;
   }
   
   public double area()
   {
      return 2*super.area()+Math.PI*radius*height;
   }
   
   public boolean equals(Cylinder other)
   {
      if (height == other.getHeight() && radius == other.getRadius())
         return true;
      return false;
   }
}