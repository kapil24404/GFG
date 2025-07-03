class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        int i = 0, j = 0, n = arr.length;

        while (j < n) {
            // Add index if negative
            if (arr[j] < 0) {
                dq.addLast(j);
            }

            // Window not full yet
            if (j - i + 1 < k) {
                j++;
            }
            // Window full
            else if (j - i + 1 == k) {
                // Get first negative using index
                if (!dq.isEmpty()) {
                    ans.add(arr[dq.peekFirst()]);
                } else {
                    ans.add(0);
                }

                // Remove index going out of the window
                if (!dq.isEmpty() && dq.peekFirst() == i) {
                    dq.removeFirst();
                }

                i++;
                j++;
            }
        }

        return ans;
    }
}
