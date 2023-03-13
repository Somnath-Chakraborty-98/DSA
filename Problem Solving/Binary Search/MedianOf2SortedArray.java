class MedianOf2SortedArray {
    static double median1(int arr1[], int arr2[], int m, int n) {
        int finalArray[] = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                finalArray[k++] = arr1[i++];
            } else {
                finalArray[k++] = arr2[j++];
            }
        }
        if (i < m) {
            while (i < m)
                finalArray[k++] = arr1[i++];
        }
        if (j < n) {
            while (j < n)
                finalArray[k++] = arr2[j++];
        }
        n = n + m;
        if (n % 2 == 1)
            return finalArray[((n + 1) / 2) - 1];
        else
            return ((double) finalArray[(n / 2) - 1] + (double) finalArray[(n / 2)]) / 2.0;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static double median2(int arr1[], int arr2[], int m, int n) {
        if (m > n)
            return median2(arr2, arr1, n, m);// ensuring that binary search happens on minimum size array

        int low = 0, high = m, medianPos = ((m + n) + 1) / 2;
        while (low <= high) {
            int cut1 = (low + high) >> 1;
            int cut2 = medianPos - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r1 = (cut1 == m) ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = (cut2 == n) ? Integer.MAX_VALUE : arr2[cut2];

            if (l1 <= r2 && l2 <= r1) {
                if ((m + n) % 2 != 0)
                    return Math.max(l1, l2);
                else
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            } else if (l1 > r2)
                high = cut1 - 1;
            else
                low = cut1 + 1;
        }
        return 0.0;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String args[]) {
        int arr1[] = { 1, 4, 7, 10, 12 };
        int arr2[] = { 2, 3, 6, 15 };
        int m = arr1.length;
        int n = arr2.length;
        System.out.print("The Median of two sorted array is ");
        System.out.printf("%.5f", median2(arr1, arr2, m, n));

    }
}