package ua.alshamari.hw4;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        System.out.println("Среднее арифмитическое: " + arithmeticMean(array));
        System.out.println("Среднее геометрическое: " + geometricMean(array));
    }

    public static int[] randomNumbers(int[] number1) {
        for (int i = 0; i < number1.length; i++) {
            number1[i] = (int)(Math.random() * 10) + 1;
//            System.out.println(number1[i]); // расскрой скобки,чтобы проверить случ. числа
        }
        return number1;
    }

    public static double arithmeticMean(int[] number2) {
        double result = 0;
        int[] sum = randomNumbers(number2);
        for (int i = 0; i < sum.length; i++) {
            result += sum[i];
        }
        double x = result / 10.0;
        return x;
    }
    public static double geometricMean(int[] number3)
    {
        double num = 1;
        int[] sum = randomNumbers(number3);
        for (int i = 0; i < number3.length; i++) {
            num *= sum[i];
        }
        double geometricMean = Math.pow(num, 1.0 / 10.0);
        return geometricMean;
    }
}


