// User function Template for Java

class Solution {
    public int maximumPoints(int arr[][]) {
        // code here
        int n=arr.length;
        int dp[][]=new int[n][4];
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                dp[i][j]=-1;
            }
        }
        return helper(n-1,3,arr,dp);
    }
    public int helper(int day,int last,int arr[][],int dp[][]){
        if(day<0) return 0;
        if(dp[day][last]!=-1) return dp[day][last];
        int maxPoints=0;
        for (int activity = 0; activity < 3; activity++) {
            if (activity != last) {
                int points = arr[day][activity] + helper(day - 1, activity, arr, dp);
                maxPoints = Math.max(maxPoints, points);
            }
        }
        return dp[day][last] = maxPoints;
    }
}