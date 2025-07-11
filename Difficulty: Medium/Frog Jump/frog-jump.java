// User function Template for Java
class Solution {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        int dp[]=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return helper(n-1,height,dp);
    }
    public int helper(int i,int height[],int dp[]){
        if(i==0) return 0;
        if(dp[i]!=-1) return dp[i];
        int firstjump=helper(i-1,height,dp)+Math.abs(height[i]-height[i-1]);
        int secondjump = Integer.MAX_VALUE;
        if(i>1){
             secondjump=helper(i-2,height,dp)+Math.abs(height[i]-height[i-2]);
        }
        dp[i]=Math.min(firstjump,secondjump);
        return dp[i];
    }
}