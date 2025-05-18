public abstract class CollegeApplication{
   protected String stdName;
   protected String major;
   
   public CollegeApplication(String name, String major)
   {
      this.stdName=name;
      this.major=major;
   }
   
   public String getStudentName(){ return stdName;}
   public String getMajor() { return major; }
   // public void setDestination(String name){ satScore=name;}
   // public void setBudget(int gpa){this.gpa=gpa;}
   public abstract boolean isAccepted();
   //returns true/false depending on whether the student's application is accepted
   public String toString(){
         return stdName+" major: "+major+ " - no addmission status";
   }
}
