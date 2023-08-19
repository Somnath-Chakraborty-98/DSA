import java.util.Arrays;

public class BinarySearchIn2DArray {
    

    static int[] searchMatrix(int[][] matrix, int target) {
        int m =  matrix.length;
        int n= matrix[0].length;
        
        int i=0;
        int j=n-1;
        while(i>=0 && i<m && j>=0 && j<n){
            if(matrix[i][j] == target) return new int[]{i,j};
            
            else if(matrix[i][j] < target) i++;
            
            else j--;
        }

       return new int[]{-1,-1};
    }


    public static void main(String[] args) {
        int[][] matrix = {{1,6,9}, {2,7,10},{4,11,15}};
        int target = 10;
        System.out.println(Arrays.toString(BinarySearchIn2DArray.searchMatrix(matrix, target)));
    }
}
