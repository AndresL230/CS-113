public class CellBills
{
   public static void main(String[] args)
   {
        double[][] famCellBills = 
            {{34.56, 75.34, 23.87}, 
            {87.79, 32.05, 23.54}, 
            {89.78, 66.76, 87.99}, 
            {45.34, 56.45, 16.54}};

        double[] bestBills = bestInMonths(famCellBills);

        System.out.print("Best Bills: ");
        
        for (double bill : bestBills) 
        {
            System.out.printf("%.2f ", bill);
        }
    }
   
   public static double[] bestInMonths(double[][] famCellBills)
   {
      double[] lows = new double[3];
      int months = famCellBills[0].length;
      
      for (int i = 0; i<months; i++)
      {
         double low = 500.00;
         for (double[] row: famCellBills)
         {
            if (row[i]<low)
               low = row[i];         
         }
         lows[i] = low;
      }
      
      return lows;  
   }
}