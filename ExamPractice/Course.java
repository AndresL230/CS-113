public class Course
{
   private StudentEx[] stdList;
   private int[] stats;
   
   public Course(int size)
   {
      stdList = new StudentEx[size];
      
      for (int i = 0; i < size; i++)
         stdList[i] = new StudentEx((int)(Math.random()*100)+1);
      
      stats = new int[11];
      
      for (StudentEx s: stdList)
      {
         if (s.getFinalScore()>89)
            stats[s.getFinalScore()-90 ]++;
      }
   }
}