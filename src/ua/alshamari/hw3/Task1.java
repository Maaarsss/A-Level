package ua.alshamari.hw3;

/*
Удаление пробелов и история про палиндром
*/

import java.util.Scanner;

public class Task1
{
    public static String x(String str)
    {
        String delete = str.replaceAll("\\s","");
        return delete;
    }
    static boolean isPalindrome(String result)
    {
        int n = result.length();
        for (int i = 0; i < (n/2); i++)
        {
            if (result.charAt(i) != result.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String result = x(str);

        System.out.println("After Removing Whitespaces the entered string is: " + result);

        System.out.println("This palindrome true or false: " + isPalindrome(result));
    }
}
