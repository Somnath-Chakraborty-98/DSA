import java.util.Arrays;

public class gridUniquePaths{
    class Solution1 {
        public int uniquePaths(int m, int n) {
            
            int x = countPaths(0,0,n,m);
            
           return x; 
        }
        
        int countPaths(int i, int j, int n, int m){
            if(i == (n-1) && j== (m-1)) return 1;
            
            if(i>=n || j>=m) return 0;
            
            else return countPaths(i+1,j,n,m) + countPaths(i, j+1,n,m);
        }
        
    }





    class Solution2 {
        public int uniquePaths(int n, int m) {
            int arr[][] = new int[n][m];
            
            for(int i=0;i<n;i++) Arrays.fill(arr[i],-1);
            
            int x = countPaths(0,0,n,m,arr);
            
           return x; 
        }
        
        int countPaths(int i, int j, int n, int m, int[][] dp){
            if(i == (n-1) && j== (m-1)) return 1;
            
            if(i>=n || j>=m) return 0;
            
            if(dp[i][j]!=-1) return dp[i][j];
            
            else return dp[i][j] =  countPaths(i+1,j,n,m,dp) + countPaths(i, j+1,n,m,dp);
        }
        
    }




    class Solution3 {
        public int uniquePaths(int n, int m) {
           
            int N = n+m-2;
            int r = m-1;
            double res = 1;
            
            for(int i=1; i<=r; i++)
                res = res * ( N - r + i) / i;                   //N C r    combination
            
            return (int)res;
        }
        
        
    }
}