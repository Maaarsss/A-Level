package Hello;

public class Task3
{
    public static void main(String[] args)
    {
        double x1 = 0.0, x2 = 2.0, x3 = 0.0;
        double y1 = 3.0, y2 = 0.0, y3 = 4.0;

        //double a = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
        //double b = Math.sqrt((x1 - x3)*(x1 - x3) + (y1 - y3)*(y1 - y3));
        //double c = Math.sqrt((x2 - x3)*(x2 - x3) + (y2 - y3)*(y2 - y3));
        double s = Math.sqrt((x1 - x3)*(y2 - y3) - (x2 - x3)*(y1 - y3) / 2);

        System.out.print(s);
    }
    public static double x1, double x2, double x3;
    public static double y1, double y2, double y3;
}
