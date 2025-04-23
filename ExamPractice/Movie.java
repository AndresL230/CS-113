public class Movie
{
   private String title;
   private int duration;
   private double price;
   
   
   public Movie(String title, int duration)
   {
      this.title = title;
      this.duration = duration;
      this.price = 10.0;
   }
   
   public Movie(String title, int duration, double price)
   {
      this.title = title;
      this.duration = duration;
      this.price = price;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public int getDuration()
   {
      return duration;
   }
   
   public String toString()
   {
      return title+" ("+duration+" min) - $"+price; 
   }
   
   public boolean isSameMovie(Movie other)
   {
      return title.toLowerCase().equals(other.getTitle().toLowerCase());
   }
   
   public boolean isCheaperThan(double threshold)
   {
      return price<=threshold;
   }
   
   public boolean hasKeyword(String keyword)
   {
      return title.toLowerCase().contains(keyword.toLowerCase());
   }
   
   public String getPriceCategory()
   {
      if (price>=15)
         return "Premium";
      else if (price>=8)
         return "Standard";
      else
         return "Budget";
   }
   
   public int compareDuration(Movie other)
   {
      if (duration>other.getDuration())
         return 1;
      else if (duration==other.getDuration())
         return 0;
      else
         return -1;
   }   
}