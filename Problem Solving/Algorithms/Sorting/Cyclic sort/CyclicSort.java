import java.util.Arrays;

public class CyclicSort {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int correctPosition = array[i] - 1;
            if (array[i] != array[correctPosition]) {
                swap(array, i, correctPosition);
            }
        }
        return array;
    }

    private static void swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    public static int missingNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int correctPosition = array[i];
            if (array.length > correctPosition && array[i] != array[correctPosition])
                swap(array, i, correctPosition);
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] != j)
                return j;
        }
        return array.length;
    }

    public static void main(String[] args) {
        System.out.println("Cyclic Sort : -");
        int[] arr1 = { 2, 5, 1, 3, 4 };
        sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Cyclic Sort to find Missing Number : -");
        int[] arr2 = { 4, 0, 2, 1 };
        int[] arr3 = { 3, 0, 2, 1 };
        System.out.print("Missing number 1 :- ");
        System.out.println(missingNumber(arr2));
        System.out.print("Missing number 2 :- ");
        System.out.println(missingNumber(arr3));
    }
}