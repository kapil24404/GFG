class Solution {
    public static int largest(int[] arr) {
        // code here
        int maxVal=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
