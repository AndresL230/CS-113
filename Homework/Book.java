public class Book
{
   private String title;
   private int pages;
   
   public Book()
   {
      title = "Java Programming";
      pages = 200;
   }
   public String getTitle()
   {
      return title;
   }
   public int getPages()
   {
      return pages;
   }
   public void setTitle(String newTitle)
   {
      title = newTitle;
   }
   public void setPages(int newPages)
   {
      pages = newPages;
   }
   public String toString()
   {
      String info = title + " is " + pages + " pages long";
      return info;
   }
   
}