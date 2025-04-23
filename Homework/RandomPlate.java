import java.util.Random;
public class RandomPlate
{
   public static void main(String[] args)
   {
      String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      Random rand = new Random();
      
      int rand1 = rand.nextInt(26);
      int rand2 = rand.nextInt(26);
      int rand3 = rand.nextInt(26);
      int rand4 = rand.nextInt(26);
      int rand5 = rand.nextInt(26);

      String randLetters = alphabet.substring(rand1-1,rand1)+alphabet.substring(rand2-1,rand2)+
      alphabet.substring(rand3-1,rand3)+alphabet.substring(rand4-1,rand4)+alphabet.substring(rand5-1,rand5);
      
      /*
      charAt() string method, not sure if use is allowed since not specifically covered in class
      String randLetters = ""+alphabet.charAt(rand.nextInt(26))+alphabet.charAt(rand.nextInt(26))+
      alphabet.charAt(rand.nextInt(26))+alphabet.charAt(rand.nextInt(26))+alphabet.charAt(rand.nextInt(26));
      */
      
      System.out.println("Random plate number: " + randLetters + (rand.nextInt(90)+10));      
   }
}