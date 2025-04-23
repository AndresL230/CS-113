public class TestArrays2 
{
    public static void main(String[] args) 
    {
        int[][] sales = {{200,350,400},{150,375,225}};
        
        int[] range = salesRange(sales);
        
        System.out.println("Lowest: " + range[0]);
        System.out.println("Highest: " + range[1]);
        System.out.println("Difference: " + range[2]);

        Die[][] diceTest = {{new Die(), new Die(), new Die()},
                            {new Die(), new Die(), new Die()}};

        int[] stats = dieStats(diceTest);

        System.out.println("\n"+stats[0] + " odd die in row 1.");
        System.out.println(stats[1] + " odd die in row 2.");
        
    }
    
    public static int[] salesRange(int[][] array)
    {
        int[] values = new int[3];

        int low = 1000;
        int high = 0;

        for (int i=0; i<array.length; i++)
        {
            for (int j=0; j<array[i].length; j++)
            {
                if (array[i][j] < low)
                    low = array[i][j];
                if (array[i][j] > high)
                    high = array[i][j];
            }
        }

        values[0] = low;
        values[1] = high;
        values[2] = high - low;
        
        return values;       
    }
    
    public static int[] dieStats(Die[][] dice)
    {
        int[] stats = {0,0};

        for (int i=0; i<dice.length; i++)
        {
            for (int j=0; j<dice[i].length; j++)
            {
                dice[i][j].roll();
            }
        }

        for (int i=0; i<dice.length; i++)
        {
            int temp = 0;

            for (int j=0; j<dice[i].length; j++)
            {
                if (dice[i][j].getFaceValue()%2 != 0)
                    temp += 1;
            }

            stats[i] = temp;
        }
        
        return stats; 
    }
}
