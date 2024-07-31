import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    int[] solution1(int arr[]) {

        int n = arr.length;
        int res[] = new int[n],
                prefix[] = new int[n],
                postfix[] = new int[n];

        prefix[0] = arr[0];
        postfix[n - 1] = arr[n - 1];
        for (int i = 1; i < n; i++) {
            prefix[i] = arr[i] * prefix[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            postfix[i] = arr[i] * postfix[i + 1];
        }

        for (int i = 0; i < n; i++) {
            if (i == 0)
                res[i] = postfix[i + 1];
            else if (i == n - 1)
                res[i] = prefix[i - 1];
            else
                res[i] = prefix[i - 1] * postfix[i + 1];
        }

        return res;
    }

    int[] solution2(int arr[]) {
        int n = arr.length;
        int res[] = new int[n];

        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] =  res[i - 1] * arr[i -1];
        }

        int post = 1; 
        for (int i = n - 1; i >= 0; i--) {
            res[i] *=  post;
            post *= arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf s1 = new ProductOfArrayExceptSelf();
        int arr[] = { 1, 2, 3, 4 };
        int n[] = s1.solution2(arr);
        System.out.println(Arrays.toString(n));
    }

}
