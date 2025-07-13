class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n=arr.length;
        Boolean dp[][]=new Boolean[n][sum+1];
        return helper(n-1,arr,sum,dp);
    }
    public static boolean helper(int i,int arr[],int sum,Boolean dp[][]){
        if(sum==0) return true;
        if(i==0) return (arr[0]==sum);
        if(dp[i][sum]!=null) return dp[i][sum];
        boolean nottake=helper(i-1,arr,sum,dp);
        boolean take=false;
        if(sum>=arr[i]){
             take=helper(i-1,arr,sum-arr[i],dp);
        }
        dp[i][sum]=take||nottake;
        return dp[i][sum];
    }
}