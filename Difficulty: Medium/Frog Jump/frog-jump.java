// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n-1,height,dp);
    }
    public static  int helper(int i,int height[],int dp[]){
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];
        int onestep=helper(i-1,height,dp)+Math.abs(height[i]-height[i-1]);
        int twostep = Integer.MAX_VALUE;
        if(i>1) twostep=helper(i-2,height,dp)+Math.abs(height[i]-height[i-2]);
        dp[i]=Math.min(onestep,twostep);
        return dp[i];
    }
}