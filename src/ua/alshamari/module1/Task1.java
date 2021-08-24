package ua.alshamari.module1;

public class Task1 {
    public static void main(String[] args) {
        int array[] = {2, 10, 2, 5, 7, 111, 5, 7, 10};
        int arrays = array.length;
        System.out.println(printDistinct(array, arrays) + "  -  unique elements are 6");
    }

    public static int printDistinct(int array[], int arrays) {
        for (int i = 0; i < arrays; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (array[i] == array[j])
                    break;
            if (i == j)
                System.out.print(array[i] + " ");
        }
        return arrays;
    }
}
