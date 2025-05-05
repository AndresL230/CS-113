public class DogTest
{
   public static void main(String[] args)
   {
      //Dog dog = new Dog("Spike");
      //System.out.println(dog.getName() + " says " + dog.speak());
      
      Dog lab = new Labrador("Rex","Chocolate");
      System.out.println("lab "+lab.getName+" says "+lab.speak());
      
      
      Dog york = new Yorkshire("Daisy");
      System.out.println("Yorkshire's name is "+york.getName());
   }
}