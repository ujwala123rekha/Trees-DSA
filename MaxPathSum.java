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
    static int[] maxi = {Integer.MIN_VALUE};
    public static int maximumPath(Node root) {
        
        maxPath(root,maxi);
        return maxi[0];
    }
    static int maxPath(Node node,int[] maxi){
        if(node == null)return 0;
        int lh = Math.max(0,maxPath(node.left,maxi));
        int rh = Math.max(0,maxPath(node.right,maxi));
        maxi[0] = Math.max(maxi[0],lh+rh+node.data);
        return Math.max(lh, rh) + node.data;
        
    }
	public static void main(String[] args) {
	    Node root = new Node(1);
	    root.left = new Node(2);
	    root.left.right = new Node(3);
	    System.out.print(maximumPath(root));
	}
}
