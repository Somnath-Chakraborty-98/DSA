public class KthElementOfTwoSortedArrays {

    static int kthelement1(int array1[], int array2[], int m, int n, int k) {
        int p1 = 0, p2 = 0, counter = 0, answer = 0;

        while (p1 < m && p2 < n) {
            if (counter == k)
                break;
            else if (array1[p1] < array2[p2]) {
                answer = array1[p1];
                ++p1;
            } else {
                answer = array2[p2];
                ++p2;
            }
            ++counter;
        }
        if (counter != k) {
            if (p1 != m - 1)
                answer = array1[k - counter];
            else
                answer = array2[k - counter];
        }
        return answer;
    }

    //////////////////////////////////////////////////////////////////////////////////////////

    static int kthelement2(int arr1[], int arr2[], int m, int n, int k) {
        if (m > n) {
            return kthelement2(arr2, arr1, n, m, k);
        }

        int low = Math.max(0, k - m), high = Math.min(k, n);

        while (low <= high) {
            int cut1 = (low + high) >> 1;
            int cut2 = k - cut1;
            int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r1 = cut1 == n ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = cut2 == m ? Integer.MAX_VALUE : arr2[cut2];

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int array1[] = { 2, 3, 6, 7, 9 };
        int array2[] = { 1, 4, 8, 10 };
        int m = array1.length;
        int n = array2.length;
        int k = 5;
        System.out.println(
                "The element at the kth position in the final sorted array is " + kthelement2(array1, array2, m, n, k));

    }
}
