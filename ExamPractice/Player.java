import java.util.Scanner;
public class Player
{
   private String name;
   private int goals;
   private int games;
   
   public Player()
   {
      Scanner scan = new Scanner(System.in);
      name = scan.nextLine();
      goals = scan.nextInt();
      games = scan.nextInt();
   }
   
   public double getAverage()
   {
      return (games == 0 ? 0: goals/games);
   }
   
   public int topPlayers(Player[] team, double target)
   {
      int count = 0;
      
      for (int i = 0; i<team.length; i++)
      {
         if (team[i].getAverage()>target)
            count++;
      }
      
      return count;
   }
}