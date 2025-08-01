class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int pindx=partition(arr,low,high);
            quickSort(arr,low,pindx-1);
            quickSort(arr,pindx+1,high);
        }
    }
     public static void swap(int i,int j,int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private int partition(int[] arr, int low, int high) {
        
        // code here
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(i,j,arr);
            }
        }
        swap(i+1,high,arr);
        return i+1;
    }
}