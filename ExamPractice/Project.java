public class Project
{
   private String title;
   private int pages;
   
   public Project(String title, int pages)
   {
      this.title = title;
      this.pages = pages;
   }
   
   public int getPages()
   {
      return this.pages;
   }
   
   public void setTitle(String title)
   {
      this.title = title;
   }
   
   public void addPages(int morePages)
   {
      pages += morePages;
   }     
   
   public String toString()
   {
      return "Project title: " + title + ", Number of pages: " + pages;
   }
   
   public boolean equals(Project project2)
   {
      return title.equals(project2.title) && pages == project2.pages;
   }
   
}