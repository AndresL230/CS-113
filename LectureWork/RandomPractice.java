import java.util.Scanner;
import java.util.Random;
public class RandomPractice
{
public static void main(String[] args)
   {
      Scanner userInp = new Scanner(System.in);
      Random rand = new Random();
      
      System.out.print("Enter your first name: ");
      String firstName = userInp.next(); 
      
      System.out.print("Enter your last name: ");
      String lastName = userInp.next();
      
      char firstRand = firstName.charAt(rand.nextInt(firstName.length())); 
      char lastRand = lastName.charAt(rand.nextInt(lastName.length()));
      
      System.out.println("Random character from first name: "+ firstRand +"\nRandom character from last name: " + lastRand);

   }
}