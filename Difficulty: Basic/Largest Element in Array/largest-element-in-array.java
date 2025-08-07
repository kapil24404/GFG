class Solution {
    public static int largest(int[] arr) {
        // code here
        int maxsum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxsum){
                maxsum=arr[i];
            }
        }
        return maxsum;
    }
}
