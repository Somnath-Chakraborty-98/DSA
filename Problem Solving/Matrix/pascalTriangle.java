import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    class Solution1 { // for the whole pascal triangle
        public List<List<Integer>> generate(int numRows) {

            List<List<Integer>> res = new ArrayList<List<Integer>>();
            List<Integer> row, prevRow = null;

            for (int i = 0; i < numRows; i++) {
                row = new ArrayList<Integer>();
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i)
                        row.add(1); // First or the last column

                    else
                        row.add(prevRow.get(j - 1) + prevRow.get(j)); // Prev Row j-1 + j = result
                }
                prevRow = row;
                res.add(row);
            }
            return res;

        }
    }
}