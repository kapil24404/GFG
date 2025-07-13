// class Solution {
//     static int knapsack(int W, int val[], int wt[]) {
//         // code here
//         int dp[][]=new int[wt.length+1][W+1];
        
//         return knap(val,wt,W,wt.length,dp);
        
//     }
//     static int knap(int val[],int wt[],int W,int n,int dp[][]){
//         if(n==0||W==0) return 0;
//     //     if(dp[n][W]!=-1){
//     //         return dp[n][W];
//     //     }
//     //     if(wt[n-1]<=W){
//     //         int include=val[n-1]+knap(val,wt,W-wt[n-1],n-1,dp);
//     //         int exclude=knap(val,wt,W,n-1,dp);
//     //         dp[n][W]=Math.max(include,exclude);
//     //         return dp[n][W];
//     //     }
//     //     else{
//     //         dp[n][W]= knap(val,wt,W,n-1,dp);
//     //         return dp[n][W];
//     //     }
//     //   // return dp[n][W];
//     //top-down approach
//     for(int i=0;i<dp.length;i++){
//         dp[i][0]=0;
//     }
//     for(int i=0;i<dp[0].length;i++){
//         dp[0][i]=0;
//     }
//     for(int i=1;i<n+1;i++){
//         for(int j=1;j<W+1;j++){
//             if(wt[i-1]<=j){
//                 dp[i][j]=Math.max((val[i-1]+dp[i-1][j-wt[i-1]]),(dp[i-1][j]));
//             }
//             else{
//                 dp[i][j]=dp[i-1][j];
//             }
//         }
//     }
//     return dp[n][W];
//     }
// }



class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        return helper(val,wt,W);
    }
    public static int helper(int val[],int wt[],int W){
        int n=val.length;
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<W+1;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<W+1;j++){
                if(wt[i-1]<=j){
                    int incl=val[i-1]+dp[i-1][j-wt[i-1]];
                    int excl=dp[i-1][j];
                    dp[i][j]=Math.max(incl,excl);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
}




































 