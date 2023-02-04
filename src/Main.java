public class Main {
    public static void main(String[] args) {
        int[] arr = { 10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int value = 7;
        arr = removeElement(arr, value);
        for (int i: arr){
            System.out.println(i + "");
        }
    }

    public static int[] removeElement(int[] arr, int value){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                count++;
            }
        }

        int[] newArr = new int[arr.length - count];
        int k = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                continue;
            }
            newArr[k++] = arr[i];
        }
        return newArr;
    }
}
