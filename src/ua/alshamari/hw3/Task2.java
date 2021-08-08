package ua.alshamari.hw3;

public class Task2
{
    public static void main(String[] args)
    {
        String str = "I'm the best Java developer in A-Level";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
        System.out.println("Number of world in a string: " + count);
    }
}
