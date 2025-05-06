abstract public class StaffMember
{
   protected String name;
   protected String address;
   protected String phone;
   
   public StaffMember (String eName, String eAddress, String ePhone)
   {
      name = eName;
      address = eAddress;
      phone = ePhone;
   }
   
   public String toString()
   {
      String result = "Name: " + name + "\n";
      result += "Address: " + address + "\n";
      result += "Phone: " + phone + "\n";
      result += "Vacation Days: "+ vacation();
      return result;
   }

   public abstract double pay();
   
   public int vacation()
   {
      return 10;
   }
}
