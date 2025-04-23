import java.util.Scanner;
import java.util.Random;
public class GradeTest
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter grade: ");
        int grade1 = inp.nextInt();
        
        Grade entry = new Grade(grade1);
        
        inp.close();

        int count=0;
        
        while (true)
        {
           Grade temp = new Grade(rand.nextInt(61)+40);
           if (temp.getLetGrade()==entry.getLetGrade())
           {
               System.out.println(temp.toString());
               if (entry.getGrade()<temp.getGrade())
               {
                  count++;
               }
           }
           if (temp.getLetGrade()!=entry.getLetGrade())
           {
               break;
           }
        }
      System.out.println(count);
   
    } 
}