class Solution {
    int countFreq(int[] arr, int target) {
        return upperBound(arr, target) - lowerBound(arr, target);
    }

    public static int lowerBound(int[] nums, int target) {
        int start = 0, end = nums.length, ans = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int upperBound(int[] nums, int target) {
        int start = 0, end = nums.length, ans = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
