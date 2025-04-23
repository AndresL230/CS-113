import java.util.Random;
import java.util.Scanner;
public class TestEV
{
   public static void main(String[] args)
   {
      Scanner inp = new Scanner(System.in);
      Random rand = new Random();
      
      System.out.print("Enter a model: ");
      String model2 = inp.nextLine();
      
      System.out.print("Enter a range: ");
      int range2 = inp.nextInt();

      inp.close();

      EV ev1 = new EV(rand.nextInt(51)+250,"Tesla Model S");
      EV ev2 = new EV(range2,model2);
      
      if (ev1.compareTo(ev2)==1)
      {
         System.out.println(ev1.toString());
      }
      else if (ev1.compareTo(ev2)==0)
      {
         System.out.println("Same");
      }
      else
      {
         System.out.println(ev2.toString());
      }
      
      if (ev1.getModel().equals(ev2.getModel()))
      {
         System.out.println("Same Model");
      }
      else
      {
         System.out.println("Different Model");
      }
   }
}