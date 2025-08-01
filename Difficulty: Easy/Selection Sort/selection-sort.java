class Solution {
    void selectionSort(int[] arr) {
        // code here
        int n=arr.length;
        for(int i=0;i<n;i++){
            int smaller=i;
            for(int j=i+1;j<n;j++){
                if(arr[smaller]>arr[j]){
                    smaller=j;
                }
            }
                int temp=arr[i];
                arr[i]=arr[smaller];
                arr[smaller]=temp;
        }
    }
}