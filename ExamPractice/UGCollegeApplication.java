public class UGCollegeApplication extends CollegeApplication
{
   private int satScore;
   private double gpa;
   
   public UGCollegeApplication(String name, String major, int satScore, double gpa)
   {
      super(name, major);
      this.satScore = satScore;
      this.gpa = gpa;
   }
   
   public int getSatScore()
   {
      return satScore;
   }
   
   public double getGpa()
   {
      return gpa;
   }
   
   public void setGpa(double gpa)
   {
      this.gpa = gpa;
   }
   
   public boolean isAccepted()
   {
      if (gpa>=3.0 && satScore>=1285)
         return true;
      return false;
   }
   
   public boolean betterAcceptChanceThan(UGCollegeApplication other)
   {
      return gpa>other.getGpa()&&satScore>other.getSatScore();
   }
}