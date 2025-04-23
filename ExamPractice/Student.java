public class Student
{
   String name;
   GPA gpa;
   
   public Student(String name, double value)
   {
      this.name = name;
      gpa = new GPA(value);
   }
   
   public GPA getGPA()
   {
      return gpa;
   }
   
   public void setName(String name)
   {
      this.name = name;
   }
   
   public boolean honorRoll(GPA other)
   {
      return gpa.getValue()>=other.getValue();
   }
   
   public String toString()
   {
      return ""+name+" has a GPA of "+gpa.getValue();
   }
}