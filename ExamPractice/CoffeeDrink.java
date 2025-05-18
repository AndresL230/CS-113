public class CoffeeDrink
{
   private Ingredient coffee, milk;
   
   public static void main(String[] args) {
    CoffeeDrink[] drinks = new CoffeeDrink[6];
    
    drinks[0] = new CoffeeDrink(new Ingredient("coffee", 4), new Ingredient("milk", 3));
    drinks[1] = new CoffeeDrink(new Ingredient("coffee", 2), new Ingredient("milk", 3));
    drinks[2] = new CoffeeDrink(new Ingredient("coffee", 2), new Ingredient("milk", 1));
    drinks[3] = new CoffeeDrink(new Ingredient("coffee", 4), new Ingredient("milk", 1));
    drinks[4] = new CoffeeDrink(new Ingredient("coffee", 3), new Ingredient("milk", 2));
    drinks[5] = new CoffeeDrink(new Ingredient("coffee", 4), new Ingredient("milk", 4));

    int[] result = testCoffeeDrinks(drinks);

    // Print frequency array
    System.out.print("Coffee strength frequencies: ");
    for (int freq: result) {
        System.out.print(freq+ " ");
    }
   }
      
   public CoffeeDrink(Ingredient i1, Ingredient i2){
      this.coffee=i1;
      this.milk=i2;
   }
   
   public Ingredient getIngred1(){
      return coffee;
   }
   
   public Ingredient getIngred2(){
      return milk;
   }
   
   public int compareTo(CoffeeDrink other)
   {
      if ((double)milk.getStrength()/coffee.getStrength() > (double)other.getIngred2().getStrength()/other.getIngred1().getStrength())
         return 1;
      else if ((double)milk.getStrength()/coffee.getStrength() < (double)other.getIngred2().getStrength()/other.getIngred1().getStrength())
         return -1;
      else
         return 0;
   }
   public String toString(){
      return coffee.toString()+"/n"+milk.toString();
   }
   
   public static int[] testCoffeeDrinks(CoffeeDrink[] drinks)
   {
      CoffeeDrink high = drinks[0];
      int size = drinks.length;
      int[] freq = new int[5];
      
      for (int i = 0; i<size;i+=1)
      {
         if (drinks[i].compareTo(high) < 0)
            high = drinks[i];
         freq[drinks[i].getIngred1().getStrength()-1]++;
      }
      
      System.out.println(high.getIngred1().getStrength()+"\n"+high.getIngred2().getStrength());
      
      return freq;
   }
}
   