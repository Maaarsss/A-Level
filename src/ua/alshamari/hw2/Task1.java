package ua.alshamari.hw2;

public class Task1
{
    public static void main(String[] args)
    {
        double x1 = 5.0, x2 = 2.0, x3 = -1.0;
        double y1 = 3.0, y2 = 3.0, y3 = -4.0;
        double result = calc(x1, x2, x3, y1, y2, y3);
        System.out.println(result);
    }

    public static double calc (double x1, double x2, double x3, double y1, double y2, double y3)
    {
        double area = Math.sqrt((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) / 2);
        return area;
    }
}
