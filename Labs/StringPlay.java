public class StringPlay
{
   public static void main (String[] args)
{
      String college = new String ("PoDunk College");

      String town = "Anytown, USA";

      int stringLength = college.length();
      String change1, change2, change3;
      System.out.println (college + " contains " + stringLength + " characters.");
      change1 = college.toUpperCase();
      change2 = change1.replace('O','*');
      change3 = college.concat(", "+town);
      System.out.println ("The final string is " + change3);
}
}