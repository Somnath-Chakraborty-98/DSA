public class FindClosestToZero {

    int solution(int arr[]) {

        // smallest number
        int num = arr[0];
        for (int n : arr) {

            if (Math.abs(n) <= Math.abs(num)) {
                if (Math.abs(n) == Math.abs(num))
                    num = Math.max(n, num);
                else
                    num = n;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        FindClosestToZero s1 = new FindClosestToZero();
        int arr[] = { 2, -1, 1 };
        int n = s1.solution(arr);
        System.out.println(n);
    }
}
