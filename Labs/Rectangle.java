public class Rectangle extends Shape
{
   private int length;
   private int width;
   
   public Rectangle(int length, int width)
   {
      super("Rectangle")
      this.length = length;
      this.width = width;
   }
   
   public int area()
   {
      return length*width;
   }
   
   public String toString()
   {
      return "Rectangle length "+length+" and width "+width;
   }

}