/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
   public static class Pair {
    Node node;
    int hd;  //Horizontal Distance (HD):
    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
  }
    static ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Pair> q=new LinkedList<>();
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            Node node = p.node;
            int hd = p.hd;
             if (!hm.containsKey(hd)) {
                hm.put(hd, node.data);
            }

            if (node.left != null) q.add(new Pair(node.left, hd - 1));
            if (node.right != null) q.add(new Pair(node.right, hd + 1));
        }
        ans.addAll(hm.values());

        return ans;
    }
}