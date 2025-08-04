class Solution {
    static List<Integer> get(int a, int b) {
        List<Integer> ans=new ArrayList<>();
        // code here
       int temp=a;
       a=b;
       b=temp;
       ans.add(a);
       ans.add(b);
       return ans;
        
    }
}