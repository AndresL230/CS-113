/*
Write a complete Java program that simulates the rolling of a pair of dice. For each die in the pair, the program should
generate a random number between 1 and 6 (inclusive). It should print out the result of the roll for each die and the total roll
(the sum of the two dice), all appropriately labeled. You must use the Random class. The RandomNumbers program in listing
3.2 of the text may be helpful.
*/
import java.util.Random;

public class DiceRoll
{
   public static void main(String[] args)
   {
      Random gen = new Random();
      int die1 = gen.nextInt(6)+1;
      int die2 = gen.nextInt(6)+1;
      
      System.out.println("Dice 1 roll: " + die1 + "\nDice 2 roll: " + die2 + "\nSum of dice roll: " + (die1+die2));
      
   }
}