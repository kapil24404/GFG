/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/

class Solution {
    public static class Pair {
    Node node;
    int hd;  //Horizontal Distance (HD):
    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
  }
    public ArrayList<Integer> bottomView(Node root) {
        // Code here
         ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Pair> q=new LinkedList<>();
        TreeMap<Integer,Integer> hm=new TreeMap<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            Node node = p.node;
            int hd = p.hd;
            hm.put(hd, node.data);
            if (node.left != null) q.add(new Pair(node.left, hd - 1));
            if (node.right != null) q.add(new Pair(node.right, hd + 1));
        }
        ans.addAll(hm.values());

        return ans;
    }
}