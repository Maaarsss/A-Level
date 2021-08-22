package ua.alshamari.hw6;

import static ua.alshamari.hw6.Phone.receiveCall;

public class Task1
{
    public static void main(String[] args)
    {
        Phone phone = new Phone();

        receiveCall();
        System.out.println("Number: " + phone.getNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Weight: " + phone.getWeight());
    }
}

