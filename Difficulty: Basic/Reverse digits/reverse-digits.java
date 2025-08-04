// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        return sum;
    }
}