import java.util.Random;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        
        Point point1 = new Point(rand.nextInt(25) + 1, rand.nextInt(25) + 1);
        Point point2 = new Point(0, 0);
        
        System.out.print("Radius for first circle: ");
        int radius1 = input.nextInt();
        
        Circle circle1 = new Circle(point1, radius1);
        Circle circle2 = new Circle(point2, 5);
        
        System.out.println(circle1);
        System.out.println(circle2);
        
        if (circle1.equals(circle2)) 
        {
            System.out.println("Distance between centers: " + point1.distance(point2));
        } 
        else 
        {
            double avgCircumference = (circle1.circumference() + circle2.circumference()) / 2;
            System.out.println("Average Circumference: " + avgCircumference);
        }
    }
}