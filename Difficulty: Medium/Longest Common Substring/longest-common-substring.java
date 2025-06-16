// User function Template for Java

class Solution {
    public int longestCommonSubstr(String s1, String s2) {
        // code here
         int m=s1.length();
        int n=s2.length();
        int dp[][]=new int[m+1][n+1];
        return LCS(s1,s2,m,n,dp);
        
    }
    public static int LCS(String t1,String t2,int m,int n,int dp[][]){
        int result=0;
           for(int i=0;i<dp.length;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<dp[0].length;j++){
                dp[0][j]=0;
            }
            for(int i=1;i<m+1;i++){
                for(int j=1;j<n+1;j++){
                if(t1.charAt(i-1)==t2.charAt(j-1)){
                dp[i][j]= 1+dp[i-1][j-1];
                 result = Math.max(result, dp[i][j]);
            }
         else{
            dp[i][j]= 0;
         }
                }
            }
           
        return result;
    }
}