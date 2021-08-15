package ua.alshamari.hw3;

/*
Угадай число
*/

import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        int secret;
        secret = (int)(Math.random() * 999 + 1);
        System.out.println("Секретное число: " + secret);

        Scanner console = new Scanner(System.in);
        int quess;
        do {
            System.out.println("Введите предположенное: ");
            quess = console.nextInt();
            System.out.println("Ваш число: " + quess);
            if (quess == secret) {
                System.out.println("Угадал!");
            } else if (quess < secret) {
                System.out.println("Мало");
            } else {
                System.out.println("Много");
            }
        } while (quess != secret) ;
    }
}
