// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        return helper(0,height,dp);
    }
    public int helper(int i,int height[],int dp[]){
        int n=height.length;
        
        if(i==n-1) return 0;
         if (dp[i] != -1) return dp[i];

        // Option 1: jump to i+1
        int oneStep = helper(i + 1, height, dp) + Math.abs(height[i] - height[i + 1]);

        // Option 2: jump to i+2 if within bounds
        int twoStep = Integer.MAX_VALUE;
        if (i + 2 < height.length) {
            twoStep = helper(i + 2, height, dp) + Math.abs(height[i] - height[i + 2]);
        }

        dp[i] = Math.min(oneStep, twoStep); // store min cost
        return dp[i];
    }
}