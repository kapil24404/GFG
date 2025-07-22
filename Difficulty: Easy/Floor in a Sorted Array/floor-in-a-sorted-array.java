class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
         return  binary(0,arr.length,x,arr);
    }
     public static int binary(int start,int end,int target,int nums[]){
        int ans=-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(target>=nums[mid]){
                ans=mid;
                start=mid+1;
            }
            else{
                
                end=mid;
                
            }
        }
        return ans;
    }
}
