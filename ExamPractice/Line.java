public class Line extends Figure
{
   private Point p1, p2;
   
   public Line(Point p1, Point p2)
   {
      super("Line");
      this.p1 = p1;
      this.p2 = p2;
   }   
   
   public double perimeter()
   {
      return p1.distance(p2);
   }
   
   public String getName()
   {
      return name;
   }
   
   public void setName(String n)
   {
      name = n;
   }

   public Point getPoint1()
   {
      return p1;
   }

   public void setPoint1(Point p)
   {
      p1 = p;
   }
   
   public Point getPoint2()
   {
      return p2;
   }

   public void setPoint2(Point p)
   {
      p2 = p;
   }
   
   public boolean equals(Line other)
   {
      return perimeter()==other.perimeter();
   }
   
   public String toString()
   {
      return "Line "+p1+" "+p2;
   }

}