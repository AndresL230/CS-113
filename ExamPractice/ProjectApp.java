import java.util.Random;
public class ProjectApp
{
   public static void main(String[] args)
   {
      Random rand = new Random();
      
      Project proj1 = new Project("Research Project",10);
      System.out.println(proj1.toString() + "\n");
      
      Project proj2 = new Project("Big Data",0);
      int dayCount = 0;
      while (proj2.getPages() < proj1.getPages())
      {
         dayCount+=1;
         int randInt = rand.nextInt(4);
         proj2.addPages(randInt);
         System.out.println("Day " + dayCount + ": Pages added: " + randInt);
      }
      System.out.println("\n"+proj2.toString());
      System.out.print("Number of days to complete: " + dayCount);
   }
}