import java.util.Random;
public class MonetaryCoin extends Coin
{
   private int value;
   Random rand = new Random();
   
   public MonetaryCoin(int value)
   {
      this.value = value;
   }
   
   public void setValue(int value)
   {
      this.value = value;
   }
   
   public int getValue()
   {
      return value;
   }
   
   public String toString()
   {
      String face;
      if (isHeads())
         face = "HEADS";
      else
         face = "TAILS";
      return value+" "+face;
   }
}