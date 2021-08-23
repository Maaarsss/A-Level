package ua.alshamari.hw6;

import static ua.alshamari.hw6.Phone.receiveCall;

public class Task1
{
    public static void main(String[] args)
    {
        Phone phone = new Phone();
        phone = new Phone(944652233, "Nokia"); // закомментируй второй и третий объект класса, чтобы получить первый вывод объекта
        phone = new Phone(993652344, "Siemens" , 6); //закомментируй, чтобы получить второй вывод объекта

        receiveCall();
        System.out.println("Number: " + phone.getNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Weight: " + phone.getWeight());
    }
}

