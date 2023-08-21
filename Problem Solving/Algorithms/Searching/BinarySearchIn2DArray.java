import java.util.Arrays;

public class BinarySearchIn2DArray {
    

    // row column sorted [1234][2345][3456][4567]
    static int[] searchMatrix1(int[][] matrix, int target) {
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

    // [123][456][789]
    static int[] searchMatrix2(int[][] matrix, int target) {
        int m =  matrix.length;
        int n= matrix[0].length;
        
        int start =0;
        int end = m-1;
        int cMid = n / 2;
        while(start < (end - 1)){
            int mid = start + (end - start) / 2;
            if(matrix[mid][cMid] == target) return new int[]{mid,cMid};
            
            else if(matrix[mid][cMid] < target) start = mid;
            
            else end = mid;
        }

        if(matrix[start][cMid] == target)   return new int[]{start, cMid};

        if(matrix[start + 1][cMid] == target)    return new int[]{start + 1,cMid};



        if(matrix[start][cMid - 1] >= target)    return simpleBS(matrix, start,0, cMid -1, target);

        if(matrix[start][cMid + 1] <= target && target <= matrix[start][n-1])    return simpleBS(matrix, start,cMid + 1, n-1, target);

        if(matrix[start + 1][cMid - 1] >= target)    return simpleBS(matrix, start + 1,0, cMid -1, target);

        else return simpleBS(matrix, start,cMid + 1, n -1, target);
    }

    static int[] simpleBS(int[][] matrix, int row, int start, int end, int target){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(matrix[row][mid] < target)    return new int[]{row, mid};

            else if(matrix[row][mid] < target) start = mid + 1;

            else end = mid - 1;
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,6,9}, {2,7,10},{4,11,15}};
        int target = 10;
        System.out.println(Arrays.toString(BinarySearchIn2DArray.searchMatrix1(matrix, target)));


        int[][] matrix2 = {{1,2,3}, {4,5,6},{7,8,9}};
        int target2 = 7;
        System.out.println(Arrays.toString(BinarySearchIn2DArray.searchMatrix2(matrix2, target2)));
    }
}
