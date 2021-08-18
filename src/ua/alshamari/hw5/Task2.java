package ua.alshamari.hw5;

import java.util.Arrays;

public class Task2
{
    public static void main(String[] args)
    {
        int array[] = {50, 40, 30, 20, 10};
        System.out.println(isSorted(array));
    }
    private static boolean isSorted(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] > array[i])
                    return false;
            }
        }
        return true;
    }
}
