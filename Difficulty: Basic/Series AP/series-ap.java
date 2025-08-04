
class Solution {
    public static int nthTermOfAP(int a1, int a2, int n) {
        // code here
        int count=a2-a1;
        for(int i=3;i<=n;i++){
            a2+=count;
        }
        if(n==1) return a1;
        if(n==2) return a2;
        return a2;
    }
}
