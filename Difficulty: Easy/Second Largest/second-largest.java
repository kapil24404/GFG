class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int firstmax=Integer.MIN_VALUE;
        int secmax=-1;
        for(int i=0;i<arr.length;i++){
            firstmax=Math.max(firstmax,arr[i]);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<firstmax && arr[i]>secmax){
                secmax=arr[i];
            }
        }
        return secmax;
    }
}