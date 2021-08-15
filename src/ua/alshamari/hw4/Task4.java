package ua.alshamari.hw4;

import java.util.Arrays;

public class Task4
{
    public static void main(String[] args)
    {
        int[] array = new int[2000];
        randomNumbers(array);
        System.out.println("Замена четных чисел на нули: " + Arrays.toString(onlyoddandzeros(array)));
    }
    public static int[] randomNumbers(int[] num)
    {
        for (int i = 0; i < num.length; i++)
        {
            num[i] = (int)(Math.random() * 10) + 1;
//            System.out.println(num[i]); // расскрой скобки,чтобы проверить случ. числа
        }
        return num;
    }

    public static int[] onlyoddandzeros(int[] num)
    {
        for (int i = 0; i < num.length; i++)
        {
            if (num[i] % 2 == 0)
            {
                num[i] = 0;
            }
        }
        return num;
    }
}
