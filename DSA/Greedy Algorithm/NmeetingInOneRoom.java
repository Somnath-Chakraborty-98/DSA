import java.util.Arrays;
import java.util.ArrayList;

public class NmeetingInOneRoom {

    static ArrayList<Integer> res = new ArrayList<Integer>();

    public void meetings(int st[], int ft[]) {

        int n = st.length;

        for (int i = 0; i < n - 1; i++) {
           if(i == 0){
            res.add(i+1);
           }
           else {
            if(ft[i-1] < st[i])
                res.add(i+1);
           }
        }

    }

    public static void main(String[] args) {
        NmeetingInOneRoom obj = new NmeetingInOneRoom();

        int st[] = { 1, 3, 0, 5, 8, 5 };
        int ft[] = { 2, 4, 6, 7, 9, 9 };

        obj.meetings(st, ft);

        System.out.println(Arrays.deepToString(res.toArray()));

    }
}