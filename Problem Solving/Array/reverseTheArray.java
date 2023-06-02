import java.util.Arrays;

public class reverseTheArray { // Recursion

    void reverse1(int arr[], int start, int end) {
        int temp;

        if (start >= end)
            return;

        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }

    void reverse2(int arr[], int start, int end) {
        int temp, j = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            } else {
                break;
            }

        }
    }

    String reverseString(String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += str.charAt(i);
        }

        return newStr;
    }

    public static void main(String[] args) {
        reverseTheArray obj = new reverseTheArray();

        int arr[] = { 5, 3, 7, 9, 1, 0, 4 };
        obj.reverse2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
