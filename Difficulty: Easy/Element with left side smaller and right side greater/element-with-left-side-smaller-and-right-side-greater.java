class Solution {
    public int findElement(int[] arr) {
        int n = arr.length;
        if (n < 3) return -1;
        int[] leftMax = new int[n];
        leftMax[0] = arr[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        int rightMin = Integer.MAX_VALUE;
        for (int i = n - 2; i > 0; i--) {
            rightMin = Math.min(rightMin, arr[i + 1]);
            if (arr[i] >= leftMax[i - 1] && arr[i] <= rightMin) {
                return arr[i];
            }
        }

        return -1;
    }
}
