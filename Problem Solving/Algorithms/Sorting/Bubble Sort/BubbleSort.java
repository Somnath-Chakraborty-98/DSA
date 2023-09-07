import java.util.Arrays;

public class BubbleSort {

    static void sort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 2, 6, 1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}