class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
         ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
         Stack<Integer> st=new Stack<>();
        boolean vis[]=new boolean[V];
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int []pair:edges){
           int u=pair[0];
           int v=pair[1];
           adj.get(u).add(v);
        }
        for(int i=0;i<V;i++){
            if(!vis[i]){
                DFS(adj,i,vis,st);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(!st.isEmpty()){
            res.add(st.pop());
        }
        return res;
    }
public static void DFS(ArrayList<ArrayList<Integer>> adj,int u,boolean []vis,Stack<Integer> st)
        {
             vis[u]=true;
             for(int v:adj.get(u)){
                 if(!vis[v]){
                    DFS(adj,v,vis,st);
                 }
             }
             st.push(u);
        }
    }
