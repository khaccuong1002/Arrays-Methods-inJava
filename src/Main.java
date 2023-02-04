public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int value = 2;
        int index = 3;

        arr = addElement(arr, value, index);
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    public static int[] addElement(int[] arr, int value, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++){
            newArr[i] = arr[i];
        }
        newArr[index] = value;
        for (int i = index + 1; i < newArr.length; i++){
            newArr[i] = arr[i - 1];
        }
        return newArr;
    }
}