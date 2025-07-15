class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int pair[]:edges){
            int u=pair[0];
            int v=pair[1];
            adj.get(u).add(v);
        }
        int indegree[]=new int[V];
         for(int i=0;i<V;i++){
            for(int v:adj.get(i)){
                indegree[v]++;
            }
         }
          Queue<Integer> q = new LinkedList<>();
            for(int i=0;i<V;i++){
                if(indegree[i]==0){
                    q.add(i);
                }
            }
            
            //BFS
            ArrayList<Integer> res=new ArrayList<>();
            while(!q.isEmpty()){
                int curr=q.poll();
                res.add(curr);
                for(int v:adj.get(curr)){
                    indegree[v]--;
                    if(indegree[v]==0){
                        q.add(v);
                    }
                }
            }
            if(res.size()!=adj.size()){
                return new ArrayList<>();
            }
            return res;
    }
}
