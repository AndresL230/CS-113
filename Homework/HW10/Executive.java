public class Executive extends Employee
{
   private double bonus;

   public Executive (String eName, String eAddress, String ePhone, String socSecNumber, double rate)
   {
      super (eName, eAddress, ePhone, socSecNumber, rate);
      bonus = 0;
   }

   public void awardBonus(double execBonus) throws BonusTooHighException
   {
      if (execBonus>10000)
         throw new BonusTooHighException("Error: Bonus Greater than $10,000");
      bonus = execBonus;
   }

   public double getBonus()
   {
      return bonus;
   }
   
   public double pay()
   {
      double payment = super.pay() + bonus;
      bonus = 0;
      return payment;
   }

   public int vacation()
   {
      return 20;
   }
}
