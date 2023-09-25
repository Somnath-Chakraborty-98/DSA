import java.util.Arrays;

public class CyclicSort {
    public static int[] sort(int[] array) {
       int i = 0;
        while(i < array.length) {
            int correctPosition = array[i] - 1;
            if (array[i] != array[correctPosition]) {
                swap(array, i, correctPosition);
            }
            else i++;
        }
        return array;
    }

    private static void swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    public static int missingNumber(int[] array) {
        int i = 0;
        while(i < array.length) {
            int correctPosition = array[i];
            if (array.length > correctPosition && array[i] != array[correctPosition])
                swap(array, i, correctPosition);
            else i++;
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] != j)
                return j;
        }
        return array.length;
    }

    public static int[] disappearedNumbers(int[] array) {
        int i = 0;
        while(i < array.length) {
            int correctPosition = array[i] - 1;
            if (array.length > correctPosition && array[i] != array[correctPosition])
                swap(array, i, correctPosition);
            else
                i++;
        }

        int[] arr = { -1 };
        int k = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != j + 1) {
                arr[k] = j + 1;
                k++;
            }
        }
        return arr;
    }

    public static int duplicateNumber(int[] array) {
        int i = 0;
        while(i < array.length) {
            int correctPosition = array[i] - 1;
            if (array.length > correctPosition && array[i] != array[correctPosition])
                swap(array, i, correctPosition);
            else
                i++;
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] != j + 1) {
                return array[j];
            }
        }
        return -1;
    }

    public static int[] duplicateAllNumbers(int[] array) {
        int i = 0;
        int[] res = {-1};
        while(i < array.length) {
            int correctPosition = array[i] - 1;
            if (array.length > correctPosition && array[i] != array[correctPosition])
                swap(array, i, correctPosition);
            else
                i++;
        }

        int c = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] != j + 1) {
                res[c] = array[j];
                c++;
            }
        }
        return res;
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

        System.out.println("Cyclic Sort to find Dissapeared Number : -");
        int[] arr4 = { 2, 3, 2, 1 };
        System.out.println(Arrays.toString(disappearedNumbers(arr4)));

        System.out.println("Cyclic Sort to find Duplicate Number : -");
        System.out.println(duplicateNumber(arr4));

        int[] arr5 = { 2, 3, 2, 4, 1 };
        System.out.println("Cyclic Sort to find All Duplicate Numbers : -");
        System.out.println(Arrays.toString(duplicateAllNumbers(arr5)));
    }
}