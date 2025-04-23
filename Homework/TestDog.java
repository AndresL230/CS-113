import java.util.Scanner;
public class TestDog
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Number of dogs in kennel: ");
      int numDogs = scan.nextInt();
      scan.nextLine();
      System.out.print("\n");
      
      double ageSum = 0;
      int dogCount = 0;
      Dog oldDog = new Dog(0,"");
      
      for (int i = 0; i<numDogs; i++)
      {
         System.out.print("Enter Dog breed: ");
         String breed = scan.nextLine();
         
         System.out.print("Enter age: ");
         int age = scan.nextInt();
         
         scan.nextLine();
         
         dogCount+=1;
         ageSum += age;
         
         Dog temp = new Dog(age,breed);
         
         if (oldDog.compareTo(temp)==-1)
         {
            oldDog.setAge(age);
            oldDog.setBreed(breed);
         }  
      }
      
      System.out.println("\nAverage age: "+(ageSum/dogCount));
      System.out.println("Oldest Dog -> "+oldDog.toString());
   }
}