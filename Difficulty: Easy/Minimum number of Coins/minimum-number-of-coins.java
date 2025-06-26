// User function Template for Java

class Solution {
    static List<Integer> minPartition(int N) {
        // code here
        List<Integer> ans=new ArrayList<>();
        int[] given = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        for(int i=0;i<given.length;i++){
            while(N>=given[i]){
                ans.add(given[i]);
                N-=given[i];
            }
        }
        return ans;
    }
}