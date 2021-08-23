package ua.alshamari.hw6;

public class Phone {
    int number = 936648811;
    String model = "Samsung";
    int weight = 2;

    public Phone() {}

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public static void receiveCall() {
        String name = "Nabil";
        System.out.println("Звонит - " + name);
    }

    public int getNumber()
    {
        return number;
    }

    public String getModel()
    {
        return model;
    }

    public int getWeight()
    {
        return weight;
    }
}