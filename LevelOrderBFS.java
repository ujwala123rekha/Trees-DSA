import java.util.*;

class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data = data;
    this.left = null;
    this.right = null;
  }
}
public class Main{
  static List<List<Integer>> bfs(Node root){
    List<List<Integer>> result = new ArrayList<>();
    if(root == null)return result;
    Queue<Node>q = new LinkedList<>();
    q.offer(root);
    while(!q.isEmpty()){
        int size = q.size();
        List<Integer>sublist=  new ArrayList<>();
        for(int i =0;i<size;i++){
            Node curr = q.poll();
            if(curr.left!=null)q.offer(curr.left);
            if(curr.right!=null)q.offer(curr.right);
            sublist.add(curr.data);
        }
        result.add(sublist);
    }
    return result;
  }
  
 public static void main(String[] args){
   Node root = new Node(1);
   root.left = new Node(2);
   root.right = new Node(3);
   root.left.left = new Node(4);
   System.out.print(bfs(root));
 }
}
