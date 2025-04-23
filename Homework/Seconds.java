import java.util.Scanner;
public class Seconds
{
   public static void main(String[] args)
   {
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter an amount of seconds: ");
      int seconds = userInput.nextInt();
      int hours, minutes, rseconds;
      hours = seconds/3600;
      minutes = (seconds - (hours*3600)) / 60;
      rseconds = seconds - ((hours*3600)+(minutes*60));
      System.out.println(hours + " hour, " + minutes + " minutes, " + rseconds + " seconds");
   }
}
 