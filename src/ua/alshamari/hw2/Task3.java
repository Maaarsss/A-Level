package ua.alshamari.hw2;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double num1 = in.nextDouble();
        System.out.println("Input the second number: ");
        double num2 = in.nextDouble();
        System.out.println("Input the third number: ");
        double num3 = in.nextDouble();
        double result = smallest(num1, num2, num3);

        System.out.println("The smallest value is " + result);
    }
    public static double smallest(double num1, double num2, double num3)
    {
        double module = num3<(num1<num2?num1:num2)?num3:((num1<num2)? num1:num2);
        return module;
    }
}