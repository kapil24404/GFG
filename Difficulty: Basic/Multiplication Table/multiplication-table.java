// User function Template for Java
class Solution {
    static ArrayList<Integer> getTable(int n) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=1;i<=10;i++){
            ans.add(n*i);
        }
        return ans;
    }
}