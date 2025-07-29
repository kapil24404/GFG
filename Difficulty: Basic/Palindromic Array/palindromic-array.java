/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        // add code here.
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(!isPalindrome(arr[i])) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int num){
        int original=num;
        int reversed=0;
        while(num>0){
            int rem=num%10;
            reversed=reversed*10+rem;
            num=num/10;
        }
        return original==reversed;
    }
}