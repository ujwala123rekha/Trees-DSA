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
public class Main
{
    static ArrayList<ArrayList<Integer>> zigzag(Node root){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if(root == null)return result;
        Queue<Node>q = new LinkedList<>();
        q.offer(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer>level = new ArrayList<>();
            for(int i =0;i<size;i++){
                Node curr = q.poll();
                level.add(curr.data);
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            if(!flag)Collections.reverse(level);
            result.add(level);
            flag = !flag;
        }
        return result;
    }
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		System.out.print(zigzag(root));
	}
}
