import java.util.Scanner;
public class NameApp
{
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
     
      System.out.println("Enter your first name: ");
      String firstName = userInput.nextLine();
      
      System.out.println("Enter your last name: ");
      String lastName = userInput.nextLine();
      
      String initials = firstName.substring(0,1) + lastName.substring(0,1);
      
      double Len = (firstName.length() + lastName.length())/2.0;
      
      System.out.println("Initials: "+initials+"\nAverage length: "+Len);
   }
}