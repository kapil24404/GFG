class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        return  binary(0,arr.length,target,arr);
    }
      public static int binary(int start,int end,int target,int nums[]){
        int ans=start;
        while(start<end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid;
            }
            else{
                 ans=mid+1;
                start=mid+1;
            }
        }
        return ans;
    }
}
