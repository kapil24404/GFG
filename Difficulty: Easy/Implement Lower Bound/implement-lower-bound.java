class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        return  binary(0,arr.length,target,arr);
    }
    public static int binary(int start,int end,int target,int nums[]){
        int ans=end;
        while(start<end){
            int mid=start+(end-start)/2;
            if(target<=nums[mid]){
                ans=mid;
                end=mid;
            }
            else{
                
                start=mid+1;
            }
        }
        return ans;
    }
}
