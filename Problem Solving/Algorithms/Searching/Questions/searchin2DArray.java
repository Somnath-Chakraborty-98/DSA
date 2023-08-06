public class searchin2DArray {
    class Solution1 {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m =  matrix.length;
            int n= matrix[0].length;
            
            for(int i=0;i<m;i++){
                if(matrix[i][0]<=target && matrix[i][n-1]>= target){
                    int mid = n /2;
                    while(mid>0 && mid<n){
                        
                        if(matrix[i][mid] == target) return true;
                        
                        else if (matrix[i][mid]> target) mid = mid/2;
                        
                        else mid = (n-1-mid)/2;
                    }
                    return false;
                }
                
            }
            
            
            return false;
            
        }
    }



    class Solution2 {
        public boolean searchMatrix(int[][] matrix, int target) {
            int m =  matrix.length;
            int n= matrix[0].length;
            
            int i=0;
            int j=n-1;
            while(i>=0 && i<m && j>=0 && j<n){
                if(matrix[i][j] == target) return true;
                
                else if(matrix[i][j] < target) i++;
                
                else j--;
            }
            
            
            return false;
            
        }
    }

}
