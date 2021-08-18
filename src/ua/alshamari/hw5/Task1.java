package ua.alshamari.hw5;

public class Task1 {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        arrays(matrix);
    }

    public static void arrays(int[][] values) {
        values[0][0] = 19;
        values[0][1] = 18;
        values[1][0] = -6;
        values[1][1] = -5;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                System.out.print(values[i][j] + " ");
            }
            System.out.println();
        }
    }
}
