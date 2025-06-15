class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int dp[][]=new int[wt.length+1][W+1];
         for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return knap(val,wt,W,wt.length,dp);
        
    }
    static int knap(int val[],int wt[],int W,int n,int dp[][]){
        if(n==0||W==0) return 0;
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(wt[n-1]<=W){
            int include=val[n-1]+knap(val,wt,W-wt[n-1],n-1,dp);
            int exclude=knap(val,wt,W,n-1,dp);
            dp[n][W]=Math.max(include,exclude);
            return dp[n][W];
        }
        else{
            dp[n][W]= knap(val,wt,W,n-1,dp);
            return dp[n][W];
        }
       // return dp[n][W];
    }
}
 