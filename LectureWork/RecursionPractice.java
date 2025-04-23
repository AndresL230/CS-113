public class RecursionPractice
{
    public static void main(String[] args) 
    {
        System.out.println("Factorial of 5: "+factorialNonRec(5));

        System.out.println("Factorial of 5: "+factorial(5));
    }

    public static int factorialNonRec(int n)
    {
        int result = 1;

        for (int i = 1; i <= n; i++)
            result = result * i;
        
        return result;
    }

    public static int factorial(int num)
    {
        if (num == 0 || num == 1)
            return 1;
            
        return num*factorial(num-1);
    }
}