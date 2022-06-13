public class rotateMatrix {
    class Solution1 {
        public void rotate(int[][] matrix) {
            int n = matrix.length;
            
            int arr[][] = new int[n][n];
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[j][n-1-i]=matrix[i][j];
                }
            }
            
            matrix = arr;
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println("");
            }
            
        }
    }














}
