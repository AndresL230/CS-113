import java.util.Random;

public class IntegerList
{
   private int[] list;
   
   public IntegerList(int size)
   {
      this.list = new int[size];
   }
   
   public void randomize()
   {
      Random rand = new Random();
      
      for (int i = 0; i<list.length; i++)
      {
         list[i] = rand.nextInt(100)+1;
      }
   }
   
   public int[] getList()
   {
      return list;
   }
   
   public void setList(int[] list)
   {
      this.list = list;
   }
   
   public String toString()
   {
      String strList = "";
      
      for (int i = 0; i<list.length; i++)
      {
         strList += list[i]+" ";
      }
      return strList;
   }
   
   public IntegerList merge(IntegerList other)
   {
      int newLength = list.length+other.getList().length;
      int [] newList = new int[newLength];
      
      for (int i = 0; i<list.length; i++)
      {
         newList[i] = list[i];
      }
      
      for (int i = 0; i<other.getList().length; i++)
      {
         newList[i+list.length] = other.getList()[i];
      }
 
      IntegerList mergedList = new IntegerList(newLength);
      mergedList.setList(newList);
      return mergedList;
   }
}