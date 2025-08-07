class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<a.length;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        for(int i=0;i<b.length;i++){
            hm.put(b[i],hm.getOrDefault(b[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> map:hm.entrySet()){
            ans.add(map.getKey());
        }
        return ans;
    }
}