public class Volunteer extends StaffMember
{
   public Volunteer (String eName, String eAddress, String ePhone)
   {
      super (eName, eAddress, ePhone);
      vacationDays = 5;
   }
   
   public double pay()
   {
      return 0.0;
   }
}
