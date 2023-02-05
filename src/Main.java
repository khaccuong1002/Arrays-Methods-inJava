public class Main {
    public static void main(String[] args) {
        int[][] array = {{4, 1, 7}, {9, 2, 6}, {3, 8, 5}};
        System.out.println("Phần tử lớn nhất là: " + findLargest(array));
    }

    public static int findLargest(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}