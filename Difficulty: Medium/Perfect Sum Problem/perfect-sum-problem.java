class Solution {
     static final int MOD = 1000000007;
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n=nums.length;
        int dp[][]=new int[n+1][target+1];
        // for(int i=0;i<dp.length;i++){
        //     dp[i][0]=1;
        // }
        // for(int i=1;i<dp[0].length;i++){
        //     dp[0][i]=0;
        // }
         for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }
        for(int i=1;i<n+1;i++){
            for(int j=0;j<target+1;j++){
                if(nums[i-1]<=j){
                    dp[i][j]=(dp[i-1][j-nums[i-1]]+dp[i-1][j])%MOD;
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][target];
    }
}