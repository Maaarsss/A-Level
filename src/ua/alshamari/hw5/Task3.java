package ua.alshamari.hw5;

public class Task3
{
    public static void main(String args[]) {
        int array[][] = new int[][]{{1, 2, 3},
                                    {4, 5, 6},
                                    {7, 8, 9}};
        System.out.println("Original array data");
        printArrayData(array);
        int newSwapArray[][] = swapArray(array);
        System.out.println("New array data swapped right");
        printArrayData(newSwapArray);
        int newSwapArray2[][] = swapArray2(array);
        System.out.println("New array data swapped left");
        printArrayData(newSwapArray2);
    }
    private static void printArrayData(int array[][]) {
        int rowCount = array.length;
        for (int i = 0; i < rowCount; i++) {
            int row[] = array[i];
            int columnCount = row.length;
            for (int j = 0; j < columnCount; j++) {
                int column = row[j];
                System.out.print(column);
                System.out.print(", ");
            }
            System.out.println();
        }
    }
    public static int[][] swapArray(int array[][]) {
        return swapArray(array, true);
    }
    public static int[][] swapArray2(int array[][]) {
        return swapArray(array, false);
    }
    private static int[][] swapArray(int array[][], boolean clockwise) {
        int arrayRowCount = getArrayRowCount(array);
        int arrayColumnCount = getArrayColumnCount(array);
        int newArray[][] = new int[arrayColumnCount][arrayRowCount];
        for (int i = 0; i < arrayRowCount; i++) {
            for (int j = 0; j < arrayColumnCount; j++) {
                if (clockwise) {
                    newArray[j][arrayRowCount - i - 1] = array[i][j];
                } else {
                    newArray[j][i] = array[i][j];
                }
            }
        }
        return newArray;
    }
    private static int getArrayRowCount(int array[][]) {
        int ret = 0;
        if (array != null) {
            ret = array.length;
        }
        return ret;
    }
    private static int getArrayColumnCount(int array[][]) {
        int ret = 0;
        if (array != null) {
            int rowCount = array.length;
            for (int i = 0; i < rowCount; i++) {
                int row[] = array[i];
                if (row.length > ret) {
                    ret = row.length;
                }
            }
        }
        return ret;
    }
}
