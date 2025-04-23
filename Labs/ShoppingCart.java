import java.text.NumberFormat;
public class ShoppingCart
{
   private Item[] cart;
   private int itemCount;
   private double totalPrice;
   private int capacity;
   
   public ShoppingCart()
   {
      capacity = 5;
      itemCount = 0;
      totalPrice = 0.0;
      cart = new Item[capacity];
   }
   
   public void addToCart(String itemName, double price, int quantity)
   {
      Item obj = new Item(itemName, price, quantity);
      
      cart[itemCount] = obj;
      
      itemCount += 1;
      totalPrice += quantity * price;
      
      if (itemCount >= cart.length)
         increaseSize();
   }

   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      String contents = "\nShopping Cart\n";
      
      contents += "\nItem\t\tUnit Price\t\tQuantity\t\tTotal\n";
      for (int i = 0; i < itemCount; i++)
         contents += cart[i].toString() + "\n";
      
      contents += "\nTotal Price: " + fmt.format(totalPrice);
      contents += "\n";
      
      return contents;
   }
   
   public double getTotalPrice()
   {
      return totalPrice;
   }

   private void increaseSize()
   {
      capacity+=3;
      
      Item[] newCart = new Item[capacity];
      
      for (int i = 0; i < itemCount; i++)
         newCart[i] = cart[i];
      
      cart = newCart;
   }
}