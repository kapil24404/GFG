// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int i=0;
        int j=0;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        while(j<arr.length){
            sum+=arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                maxsum=Math.max(maxsum,sum);
                sum-=arr[i];
                i++;
                j++;
            }
            
        }
        return maxsum;
    }
}