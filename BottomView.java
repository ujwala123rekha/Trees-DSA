//here we are rewriting the indices
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
class Pair{
    Node node;
    int hd;
    Pair(Node node,int hd){
        this.node = node;
        this.hd = hd;
    }
}
public class Main
{
    static ArrayList<Integer> TopView(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null)return result;
        Queue<Pair>q = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair curr = q.poll();
            Node node = curr.node;
            int hd = curr.hd;
            //the main diff btwn the top and bottom only if 
            map.put(hd,node.data);
            if(node.left!=null){
                q.offer(new Pair(node.left,hd-1));
            }
            if(node.right!=null){
                q.offer(new Pair(node.right,hd+1));
            }
        }
        for(int val:map.values()){
                result.add(val);
            }
        return result;
    }
	public static void main(String[] args) {
	    Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        ArrayList<Integer> result = TopView(root);

        System.out.println(result);
	}
}
