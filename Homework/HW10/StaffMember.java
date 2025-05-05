abstract public class StaffMember
{
   protected String name;
   protected String address;
   protected String phone;
   protected int vacationDays;
   
   public StaffMember (String eName, String eAddress, String ePhone)
   {
      name = eName;
      address = eAddress;
      phone = ePhone;
      vacationDays = 10;
   }
   
   public String toString()
   {
      String result = "Name: " + name + "\n";
      result += "Address: " + address + "\n";
      result += "Phone: " + phone + "\n";
      result += "Vacation Days: "+ vacationDays;
      return result;
   }

   public abstract double pay();
   
   public int vacation()
   {
      return vacationDays;
   }
}
