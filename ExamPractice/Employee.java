public class Employee
{
   private String name;
   private int[] scores;
   
   public Employee(String name, int[] scores)
   {
      this.name = name;
      this.scores = scores;
   }
   
   public double getAverageScore()
   {
      double total = 0.0;
      
      for (int score: scores)
         total+=score;
      
      return total/scores.length;
   }
   
   public boolean passedAllProjects()
   {
      int passed = 0;
      
      for (int score: scores)
         if (score>=60)
            passed+=1;
      
      return passed==scores.length;
   }
   
   public String toString()
   {
      return name + " has an average score of "+getAverageScore();
   }
   
   public static Employee[] topPerformers(Employee[] team, double minAverage)
   {
      int size = 0;
      
      for (Employee e: team)
         if (e.getAverageScore()>=minAverage && e.passedAllProjects())
            size+=1;
      
      Employee[] top = new Employee[size];
      
      int index = 0;
      for (int j = 0; j<team.length; j++)
         if (team[j].getAverageScore()>=minAverage && team[j].passedAllProjects())
         {
            top[index] = team[j];
            index++;
         }
      
      return top;
   }
   
   public static void main(String[] args)
   {
       Employee[] staff = {
       new Employee("Alice", new int[]{85, 90, 88}),
       new Employee("Bob", new int[]{45, 60, 70}),
       new Employee("Charlie", new int[]{78, 82, 76}),
       new Employee("Diana", new int[]{92, 47, 88})
       };
   
      Employee[] result = topPerformers(staff, 70.0);
      
      for (Employee e: result)
         System.out.println(e.toString());
   }
}