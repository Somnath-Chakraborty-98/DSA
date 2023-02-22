import java.util.*;

public class MinNoOfCoins {
    public static void main(String[] args) {

        int V = 49;
        ArrayList < Integer > ans = new ArrayList < > ();
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
        int n = coins.length;
        for (int i = n - 1; i >= 0; i--) {
            if(V<=0)
                break;

            while (V >= coins[i]) {
                V -= coins[i];
                ans.add(coins[i]);
            }
        }
        System.out.println("The minimum number of coins is "+ans.size());
        System.out.println("The coins are ");
        for (int i = 0; i < ans.size(); i++) {
          System.out.print(" " + ans.get(i));
        }
    
    }
}
/*
 * // A Naive recursive JAVA program to find minimum of coins
 * // to make a given change V
 * import java.io.*;
 * import java.util.*;
 * public class coin
 * {
 * // m is size of coins array (number of different coins)
 * static int minCoins(int coins[], int m, int V)
 * {
 * // base case
 * if (V == 0) return 0;
 * 
 * // Initialize result
 * int res = 0;
 * Arrays.sort(coins);
 * 
 * // Try every coin that has smaller value than V
 * for(int i=m-1;i>=0;i--)
 * {
 * if(V>0)
 * {
 * while(coins[i]<V)
 * {
 * V = V-coins[i];
 * res++;
 * }
 * }
 * else
 * break;
 * }
 * return res;
 * }
 * public static void main(String args[])
 * {
 * int coins[] = {9, 6, 5, 1};
 * int m = coins.length;
 * int V = 11;
 * System.out.println("Minimum coins required is "+ minCoins(coins, m, V) );
 * }
 * }/* This code is contributed by Rajat Mishra
 */

*/