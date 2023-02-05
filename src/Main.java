import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập SIZE của mảng: ");
        int SIZE = input.nextInt();

        int[] numbers = new int[SIZE];

        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < SIZE; i++) {
            numbers[i] = input.nextInt();
        }

        input.close();

        System.out.println("Mảng: " + Arrays.toString(numbers));

        int index = minValue(numbers);
        System.out.println("Giá trị nhỏ nhất trong mảng: " + numbers[index]);
    }

    public static int minValue(int[] array){
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}