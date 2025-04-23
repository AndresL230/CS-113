import java.util.Scanner;

public class ShoppingTest
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      ShoppingCart cartOne = new ShoppingCart();
      
      while (true)
      {       
         System.out.print("Enter item name: ");
         String item = scan.nextLine();
         
         if (item.equals("\n") || item.equals(""))
            break;
         
         System.out.print("Enter item price: ");
         double price = scan.nextDouble();
         
         System.out.print("Enter item quantity: ");
         int quant = scan.nextInt();
         
         scan.nextLine();
         
         cartOne.addToCart(item, price, quant);
         
         System.out.println(cartOne.toString());
      }
      
      System.out.println("\nPlease pay $"+cartOne.getTotalPrice());
      
   }
}