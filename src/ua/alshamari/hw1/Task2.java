package Java.Task1;

import java.util.Scanner;
public class Task2
{
    public static void main(String[] args)
    {
        int reversenum = 0;

        System.out.print("Введите число: ");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        while(num != 0)
        {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }
        System.out.print("Введите теперь в обратном порядке число: " + reversenum);
    }
}
