// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        // code here.
        int ans[]=new int[2];
        Arrays.fill(ans,-1);
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                ans[1]=i;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==key){
                ans[0]=i;
            }
        }
        return ans;
    }
}