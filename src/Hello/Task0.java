package Hello;
import java.util.Scanner;

public class Task0
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Введите ширину треугольника: ");
        double width = console.nextInt(); // переменная с названием width

        System.out.print("Введите высоту треугольника: ");
        double heigth = console.nextInt(); // переменная с названием высоты

        double area = (width * heigth) / 2; // формула = ширину умножаем на высоту и делим на 2
        System.out.print("Площадь треугольника равна: " + area);
    }
}
