public class Circle
{
   private Point center;
   private float radius;
   
   public Circle(int x, int y, float radius)
   {
      this.radius = radius;
      
      this.center = new Point(x,y);
   }
   
   public Point getCenter()
   {
      return center;
   }
   
   public void setRadius(float radius)
   {
      this.radius = radius;
   }
   
   public boolean liesOnCircle(Point other)
   {
      double distance = center.distance(other);
      
      return distance == this.radius;
   }
}