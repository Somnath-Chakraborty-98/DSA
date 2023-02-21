import java.util.Arrays;

public class NmeetingsInOneRoom {

    class mycomparator implements Comparator<meeting> {
        @Override
        public int compare(meeting o1, meeting o2) {
            if (o1.end < o2.end) {

                // Return -1 if second object is
                // bigger than first
                return -1;
            } else if (o1.end > o2.end)

                // Return 1 if second object is
                // smaller than first
                return 1;

            return 0;
        }
    }

    class meeting {
        int start;
        int end;
        int pos;

        meeting(int start, int end, int pos) {
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }

    class Solution {
        // Function to find the maximum number of meetings that can
        // be performed in a meeting room.
        public static int maxMeetings(int start[], int end[], int n) {
            // add your code here
            int m = start.length;
            int l = end.length;
            int sol = 0;
            int endTime = 0;
            // ArrayList<Integer> m = new ArrayList<>();

            ArrayList<meeting> meet = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                meet.add(new meeting(start[i], end[i], i));
            }

            mycomparator mc = new mycomparator();

            Collections.sort(meet, mc);
            // m.add(meet.get(0).end);
            sol++;

            endTime = meet.get(0).end;
            for (int i = 1; i < meet.size(); i++) {
                if (meet.get(i).start > endTime) {
                    endTime = meet.get(i).end;
                    sol++;
                }
            }

            // if(start[0] < )
            return sol;
        }
    }
}