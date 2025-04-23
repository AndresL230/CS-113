public class EV
{
   private int range;
   private String model;
   
   public EV(int inRange,String inModel)
   {
      range = inRange;
      model = inModel;
   }
   
   public int getRange()
   {
      return range;
   }
   
   public String getModel()
   {
      return model;
   }
   
   public void setRange(int newRange)
   {
      range = newRange;
   }
   
   public String toString()
   {
      return "Model: "+model+", Range: "+range;
   }
   
   public int compareTo(EV ev2)
   {
      if (range>ev2.getRange())
      {
         return 1;
      }
      else if (range==ev2.getRange())
      {
         return 0;
      }
      else
      {
         return -1;
      }
   }
   
   public boolean sameModel(EV ev2)
   {
      return model.equals(ev2.getModel());
   }
}