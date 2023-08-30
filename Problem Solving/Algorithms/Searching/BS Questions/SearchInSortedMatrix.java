import java.util.Arrays;

public class SearchInSortedMatrix {
    // [123][456][789]
    static int[] searchMatrix2(int[][] matrix, int target) {
        int rows = matrix.length;
        int column = matrix[0].length;

        if (rows == 1) {
            return simpleBS(matrix, 0, 0, column - 1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int columnMid = column / 2;

        while (rowStart < (rowEnd - 1)) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (matrix[mid][columnMid] == target) {
                return new int[]{mid, columnMid};
            } else if (matrix[mid][columnMid] < target) {
                rowStart = mid;
            } else {
                rowEnd = mid;
            }
        }

        if (matrix[rowStart][columnMid] == target) {
            return new int[]{rowStart, columnMid};
        }

        if (matrix[rowStart + 1][columnMid] == target) {
            return new int[]{rowStart + 1, columnMid};
        }

        if (target <= matrix[rowStart][columnMid - 1]) {
            return simpleBS(matrix, rowStart, 0, columnMid - 1, target);
        } else if (target >= matrix[rowStart][columnMid + 1] && target <= matrix[rowStart][column - 1]) {
            return simpleBS(matrix, rowStart, columnMid + 1, column - 1, target);
        } else if (target <= matrix[rowStart + 1][columnMid - 1]) {
            return simpleBS(matrix, rowStart + 1, 0, columnMid - 1, target);
        } else {
            return simpleBS(matrix, rowStart + 1, columnMid + 1, column - 1, target);
        }
    }

    static int[] simpleBS(int[][] matrix, int row, int columnStart, int columnEnd, int target){
        while (columnStart <= columnEnd) {
            int mid = columnStart + (columnEnd - columnStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                columnStart = mid + 1;
            } else {
                columnEnd = columnStart - 1;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 7;
        System.out.println(Arrays.toString(searchMatrix2(arr, target)));
    }
}
