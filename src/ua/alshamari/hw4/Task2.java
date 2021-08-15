package ua.alshamari.hw4;

public class Task2
{
    public static void main(String[] args)
    {
        
        int[] integer = new int[1000];
        for (int i = 0; i < integer.length; i++)
        {
            integer[i] = (int) (Math.random() * 10) + 1;
        }
        for (int i = 1; i <= integer.length; i++)
        {
            boolean isPrime = true;
            for (int z = 2; z < i; z++)
            {
                if (i % z == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(i);
        }
    }
}
