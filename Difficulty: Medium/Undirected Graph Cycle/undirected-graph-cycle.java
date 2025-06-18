class Solution {
    class Pair {
    int first, second;
    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int edge[]: edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean[] vis=new boolean[V];
        for(int i=0;i<V;i++){
            if(!vis[i]){
                if(BFS(adj,i,vis,-1)) return true;
            }
        }
        return false;
    }
   public boolean BFS(ArrayList<ArrayList<Integer>> adj,int u,boolean[] vis,int parent){
       Queue<Pair> q=new LinkedList<>();
       q.add(new Pair(u,parent));
       vis[u]=true;
       while(!q.isEmpty()){
           Pair a=q.poll();
           int src=a.first,dst=a.second;
           for(int v:adj.get(src)){
               if(!vis[v]){
                   vis[v]=true;
                   q.add(new Pair(v,src));
               }
               else if(v!=dst){
                   return true;
               }
           }
       }
       return false;
}
}