
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // Code here
        int count=0;
        int n=arr.size();
        for(int i=0;i<n;i++){
            if(x>=arr.get(i)){
                count++;
            }
        }
        return count;
    }
}