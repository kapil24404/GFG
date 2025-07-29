class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        // int maxele=0;
        // int secmax=-1;
        // for(int i=0;i<arr.length;i++){
        //     maxele=Math.max(maxele,arr[i]);
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]<maxele)
        //     secmax=Math.max(secmax,arr[i]);
        // }
        
        // return secmax;
        int firstmax=Integer.MIN_VALUE;
        int secmax=-1;
        int n=arr.length;
        for(int i=0;i<n;i++){
            firstmax=Math.max(firstmax,arr[i]);
        }
        for(int i=0;i<n;i++){
            if(arr[i]<firstmax){
             secmax=Math.max(secmax,arr[i]);
            }
        }
        return secmax;
    }
}