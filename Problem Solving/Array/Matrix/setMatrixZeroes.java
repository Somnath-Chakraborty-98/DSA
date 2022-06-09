public class setMatrixZeroes {
    class Solution1 {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    
                    if(matrix[i][j] == 0){
                        for(int k=0;k<n;k++){                   //Rows to -10 as -10 is not in any test case
                            if(matrix[i][k] != 0)               // Wer are checking for 0 because if we convert 0 to -10 then its columns will not get changed
                            matrix[i][k] = -10;
                            
                        }
                        for(int s=0;s<m;s++){                   //Columns to -10 as -10 is not in any test case
                            if(matrix[s][j] != 0)               // Wer are checking for 0 because if we convert 0 to -10 then its columns will not get changed
                            matrix[s][j] = -10;
                        }
                    }
                    
                    
                }
            }
            
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(matrix[i][j] == -10){
                        matrix[i][j] = 0;
                    }
                }
            }
            
            
        }
    }





    class Solution2 {
        public void setZeroes(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int col0 = 1;  //True ;0 = false
            
            for(int i=0; i<m; i++){
                
                if(matrix[i][0] == 0) col0 = 0;
                
                for(int j=0; j<n; j++){
                    
                    if(matrix[i][j] == 0) matrix[i][0] = matrix [0][j] = 0;
                    
                }
            }
            
            for(int i = m-1; i >= 0; i--){
                for(int j = n-1; j >= 1; j--){
                    
                    if(matrix[i][0] == 0 || matrix[0][j] == 0)   matrix[i][j] = 0;
                    
                }
                    
                    if(col0 == 0) matrix[i][0] = 0;
            }
            
            
        }
    }
}
