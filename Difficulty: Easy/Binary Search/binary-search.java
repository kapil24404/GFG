class Solution {
    public int binarysearch(int[] arr, int k) {
        // Code Here
        int n=arr.length;
        int start=0;
        int end=n-1;
        int result=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==k){
                result = mid;    
                end = mid - 1;
            }
            else if(k>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return result;
    }
}