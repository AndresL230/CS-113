public class Product
{
   private String name;
   private double price;
   private int stock;
   private String[] warehouses;
   
   public Product(String name, double price, int stock, String[] warehouses)
   {
      this.name = name;
      this.price = price;
      this.stock = stock;
      this.warehouses = warehouses;
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public String getName()
   {
      return name;
   }
   
   public boolean isLowStock()
   {
      if (stock<10)
         return true;
      
      return false;
   }
   
   public int comparePrice(Product other)
   {
      if (other.getPrice()>price)
         return -1;
      else if (other.getPrice()<price)
         return 1;
      else
         return 0;
   }
   
   public String toString()
   {
      String warehouseStr = "Warehouses: [";
      
      for (String warehouse: warehouses)
         warehouseStr += warehouse+", ";
      
      return name+" - (Stock: "+stock+") | "+warehouseStr+"\b]";
   }
   
   public boolean isAvailableIn(String location)
   {
      for (String warehouse: warehouses)
         if (warehouse.equals(location))
            return true;
      return false;
   }
   
   public static void main(String[] args)
   {
        Product p1 = new Product("Hammer", 12.99, 5, new String[]{"NYC", "Chicago"});
        Product p2 = new Product("Drill", 59.99, 20, new String[]{"LA", "Houston"});
        Product p3 = new Product("Saw", 34.50, 9, new String[]{"Chicago", "Dallas"});

        // Test toString()
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println();

        // Test isLowStock()
        System.out.println(p1.getName() + " low stock? " + p1.isLowStock());
        System.out.println(p2.getName() + " low stock? " + p2.isLowStock());
        System.out.println(p3.getName() + " low stock? " + p3.isLowStock());
        System.out.println();

        // Test comparePrice()
        int comparison = p1.comparePrice(p3);
        if (comparison == 1)
            System.out.println(p1.getName() + " is more expensive than " + p3.getName());
        else if (comparison == -1)
            System.out.println(p3.getName() + " is more expensive than " + p1.getName());
        else 
            System.out.println(p1.getName() + " and " + p3.getName() + " have the same price.");
        
        System.out.println();

        // Test isAvailableIn()
        System.out.println(p1.getName() + " available in Chicago? " + p1.isAvailableIn("Chicago"));
        System.out.println(p1.getName() + " available in Miami? " + p1.isAvailableIn("Miami"));
   }
   
}