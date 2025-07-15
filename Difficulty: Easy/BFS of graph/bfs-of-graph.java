class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean vis[]=new boolean[adj.size()];
        ArrayList<Integer> res=new ArrayList<>();
        BFS(adj,0,vis,res);
        return res;
       
    }
    public static void BFS(ArrayList<ArrayList<Integer>> adj,int u,boolean vis[],ArrayList<Integer> res){
        Queue<Integer> q=new LinkedList<>();
        q.add(u);
         vis[u] = true;
        while(!q.isEmpty()){
            int curr=q.poll();
            res.add(curr);
            for(int v:adj.get(curr)){
                if(!vis[v]){
                    q.add(v);
                    vis[v]=true;
                }
            }
        }
    }
}