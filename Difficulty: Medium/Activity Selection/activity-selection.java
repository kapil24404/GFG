import java.util.*;

class Solution {
    public int activitySelection(int[] start, int[] finish) {
        int n = start.length;

        // Store activities as {start, finish}
        List<int[]> activities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            activities.add(new int[]{start[i], finish[i]});
        }

        // Sort by finish time, and if tie, by start time
        activities.sort((a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[0], b[0]);
        });

        int count = 0;
        int lastFinish = -1;

        for (int[] activity : activities) {
            if (activity[0] > lastFinish) {
                count++;
                lastFinish = activity[1];
            }
        }

        return count;
    }
}
