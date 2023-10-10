public class IsSorted {

    static boolean sorted(int[] arr, int index) {

        if (index == arr.length - 1)
            return true;

        return arr[index] < arr[index + 1] && sorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 8, 6, 9 };
        System.out.println(IsSorted.sorted(arr, 0));
    }
}