import java.util.Random;
public class TestMCoins
{
   public static void main(String args[])
   {
      Random rand = new Random();
      
      MonetaryCoin[][] bag = {
      {new MonetaryCoin(rand.nextInt(100)+1),new MonetaryCoin(rand.nextInt(100)+1),new MonetaryCoin(rand.nextInt(100)+1)},
      {new MonetaryCoin(rand.nextInt(100)+1),new MonetaryCoin(rand.nextInt(100)+1),new MonetaryCoin(rand.nextInt(100)+1)},
      {new MonetaryCoin(rand.nextInt(100)+1),new MonetaryCoin(rand.nextInt(100)+1),new MonetaryCoin(rand.nextInt(100)+1)}};
      
      for (MonetaryCoin[] pouch: bag)
      {
         int value = 0;
         for (MonetaryCoin coin: pouch)
         {
            //System.out.print(coin+", ");
            if (coin.isHeads())
            {
               value += coin.getValue();
            }
         }
         System.out.print(value+" ");
         //System.out.println();
      }
   }
}