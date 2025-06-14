class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
        int []indegree=new int[V];
        for(int i=0;i<V;i++){
            for(int v:adj.get(i)){
                indegree[v]++;
            }
        }
         Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        BFS(adj,indegree,q,res);
        return res;
        
    }
    public static ArrayList<Integer> BFS(ArrayList<ArrayList<Integer>> adj,int []indegree,Queue<Integer> q, ArrayList<Integer> res){
       while(!q.isEmpty()){
           int node=q.poll();
           res.add(node);
           for(int v:adj.get(node)){
               indegree[v]--;
               if(indegree[v]==0){
                   q.offer(v);
               }
           }
       } 
       if(res.size()!=adj.size()){
           return new ArrayList<>();
       }
       return res;
    }
}