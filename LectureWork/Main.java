import java.util.Scanner;
import java.util.Random;
import java.text.NumberFormat;
import java.text.DecimalFormat;
public class Main {
    /*public static void main(String[] args) 
    {
        int keys = 88;
        double sum = 30.92;
        double result = (float) sum / keys;
        String entered;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a piece of text: ");
        entered = scan.nextLine();
        System.out.print("You entered \'"+ entered +"\'");

       System.out.println(result);
    }
    public static void main(String[] args) 
    {
      int keys = 88;
      double sum = 30.92;
      double result = (float) sum / keys;
    }
    public static void main(String[] args) 
    {
        int miles;
        double gallons, mpg;

        Scanner scan = new Scanner(System.in);

        System.out.print("How many miles: ");
        miles = scan.nextInt();

        System.out.println("How many gallons used: ");
        gallons = scan.nextInt();

        mpg = miles/gallons;

        System.out.println("Miles per gallon: "+mpg);
        

    }
    public static void main(String[] args)
    {
        String phrase = "Change is inevitable";
        String mutation1, mutation2, mutation3, mutation4;

        System.out.println("Original string: \"" + phrase + "\"");
        System.out.println("Length of string: " + phrase.length());
        mutation1 = phrase.concat(", except from vending machines.");
        mutation2 = mutation1.toUpperCase();
        mutation3 = mutation2.replace('E', 'X');
        mutation4 = mutation3.substring(3, 30);
        System.out.println("Mutation #1: " + mutation1);
        System.out.println("Mutation #2: " + mutation2);
        System.out.println("Mutation #3: " + mutation3);
        System.out.println("Mutation #4: " + mutation4);
  
        System.out.println("Mutated length: " + mutation4.length());
        System.out.println("Hello World");
        Random rand = new Random();
        double rand1 = rand.nextDouble(100);
        if (rand1%2==0)
        {
            System.out.println(rand1+" is even");
        }
        else
        {
            System.out.println(rand1+" is odd");
        }
        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
         
        cars[0] = "Mustang";    
         
        System.out.println(cars[0]);
         
        String[] carsnew = new String[3];
         
        carsnew[0] = "Camaro";
        carsnew[1] = "Corvette";
        carsnew[2] = "Tesla";
         
        for(int i=0; i<cars.length; i++)
        {
           System.out.println(cars[i]);
        }
        for (int i=10; i>0; i--)
        {
            System.out.println("pizza"+i);
        } 

    }
    public static void main(String[] args) throws InterruptedException
    {
        int start = 10;
        for (int i = start; i > 0; i--)
        {
        System.out.println(i);
        Thread.sleep(1000);
        }
        System.out.println("Happy New Year");
    }
   */
   public static void main(String[] args)
   {
      Die die1 = new Die();
      System.out.println(die1.getFaceValue());
   }
}