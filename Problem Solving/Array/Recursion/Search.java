public class Search {

    static boolean find(int[] arr, int index, int target) {
        if (index == arr.length - 1)
            return false;
        return arr[index] == target || find(arr, index + 1, target);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 8, 9, 15, 11, 20, 43 };
        System.out.println(Search.find(arr, 0, 99));
    }
}
