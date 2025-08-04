// User function Template for Java
class Solution {
    public boolean isPowerOfAnother(int X, int Y) {
        // code here
        if (Y == 1) return true;
        if(X==1) return false;
        long power=1;
        while(power<Y){
            power*=X;
            if(power==Y) return true;
        }
        return false;
    }
}
