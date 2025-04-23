import java.util.Scanner;
public class TestBook
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      Book book1 = new Book();
      System.out.print("Enter the 1st books name: ");
      String title1 = input.nextLine();
      System.out.print("Enter the amount of pages: ");
      int pages1 = input.nextInt();
      
      book1.setTitle(title1);
      book1.setPages(pages1);
      
      input.nextLine();
      
      Book book2 = new Book();
      System.out.print("Enter the 2nd books name: ");
      String title2 = input.nextLine();
      System.out.print("Enter the amount of pages: ");
      int pages2 = input.nextInt();
      
      book2.setTitle(title2);
      book2.setPages(pages2);
      
      System.out.println(book1.toString());
      System.out.println(book2.toString());
      
      double average = (pages1+pages2)/2.0;
      
      System.out.print(average + " is the average page count of the two books.");
   }
}