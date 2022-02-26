import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args){
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int N=arr.length;

        for (int j = 0; j < N; j++)
        {
            for (int i = N - 1; i >= 0; i--)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        
    }
}
