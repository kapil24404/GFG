class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        int V=adj.size();
        boolean vis[]=new boolean[V];
        ArrayList<Integer> res=new ArrayList<>();
        BFS(adj,0,vis,res);
        return res;
        
    }
    public void BFS(ArrayList<ArrayList<Integer>> adj,int u,boolean[] vis,ArrayList<Integer> res){
        Queue<Integer> q=new LinkedList<>();
        q.add(u);
        vis[u]=true;
        res.add(u);
        while(!q.isEmpty()){
            int a=q.poll();
            for(int v:adj.get(a)){
             if(!vis[v]){
                 q.add(v);
                 vis[v]=true;
                 res.add(v);
             } 
            }
        }
    }
}